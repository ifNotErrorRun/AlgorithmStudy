import sys
inp = sys.stdin.readline

# 상수 정의
SIZE = 5
MOVES = [
    (-1, 0),  # UP
    (0, 1),   # RIGHT
    (1, 0),   # DOWN
    (0, -1)   # LEFT
]

# 격자판 입력
maze = []
for _ in range(SIZE):
    row = list(map(int, inp().strip().split()))
    maze.append(row)

# 시작 위치 입력
start_r, start_c = map(int, inp().strip().split())

# 방문 배열 초기화
visited = [[False] * SIZE for _ in range(SIZE)]

def DFS(r, c, moves, apples):
    """
    DFS로 사과 2개를 3번 이내의 이동으로 찾을 수 있는지 확인
    r, c: 현재 위치
    moves: 현재까지의 이동 횟수
    apples: 현재까지 찾은 사과 개수
    """
    # 성공 조건: 사과 2개 이상 발견
    if apples >= 2:
        return 1
        
    # 실패 조건: 3번 이상 이동
    if moves >= 3:
        return 0
    
    # 4방향 탐색
    for dr, dc in MOVES:
        # 다음 위치 계산
        nr, nc = r + dr, c + dc
        
        # 맵 범위 체크
        if nr < 0 or nr >= SIZE or nc < 0 or nc >= SIZE:
            continue
            
        # 미방문 위치만 처리
        if not visited[nr][nc]:
            next_block = maze[nr][nc]
            
            # 장애물이면 스킵
            if next_block == -1:
                continue
                
            # 방문 처리
            visited[nr][nc] = True
            
            # 사과를 발견한 경우
            if next_block == 1:
                if DFS(nr, nc, moves + 1, apples + 1) == 1:
                    return 1
            # 빈 공간인 경우
            else:
                if DFS(nr, nc, moves + 1, apples) == 1:
                    return 1
                    
            # 백트래킹
            visited[nr][nc] = False
    
    # 모든 방향 탐색 실패
    return 0

# 시작 위치의 사과 여부 확인
start_apples = 1 if maze[start_r][start_c] == 1 else 0

# 시작 위치 방문 처리
visited[start_r][start_c] = True

# DFS 실행 및 결과 출력
result = DFS(start_r, start_c, 0, start_apples)
print(result)