# 1  cab, 0 no cab
# DFS
import sys
inp = lambda: sys.stdin.readline().rstrip()

def traverse(r:int, c:int, visited:list, moves:tuple):
    if farm[r][c] == 0:
        return 0

    # DFS implemented with a list as stack 
    stack = [(r, c)]

    while stack:
        y, x = stack.pop()
        visited[y][x] = True

        for dy, dx in moves:
            ny, nx = y + dy, x + dx
            if 0 <= ny < len(visited) and 0 <= nx < len(visited[0]):
                if visited[ny][nx] is False and farm[ny][nx] == 1:
                    stack.append((ny, nx))
    return 1

T = int(inp())
MOVES = (
    (-1, 0), #UP
    (0, 1), #RIGHT
    (1, 0), #DOWN
    (0, -1), #LEFT
)

for _ in range(T):
    M, N, K = map(int, inp().split())

    ctn = 0
    visited = [ [False] * M for _ in range(N)]
    farm = [ [0] * M for _ in range(N)]
    for _ in range(K):
        # col, row
        X, Y = map(int, inp().split())
        farm[Y][X] = 1

    for row in range(N):
        for col in range(M):
            if visited[row][col] is False:
                ctn += traverse(row, col, visited, MOVES)
    
    print(ctn)