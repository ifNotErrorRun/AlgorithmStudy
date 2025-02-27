from collections import deque

def min_rotation_count(n, target_numbers):
    queue = deque(range(1, n + 1))  # 1부터 n까지의 수를 큐에 넣음
    total_count = 0
    
    for target in target_numbers:
        # 타겟의 현재 위치 찾기
        target_idx = queue.index(target)
        queue_size = len(queue)
        
        # 왼쪽으로 가는 게 빠른지, 오른쪽으로 가는 게 빠른지 판단
        left_count = target_idx
        right_count = queue_size - target_idx
        
        # 더 적은 회전이 필요한 방향으로 이동
        if left_count <= right_count:
            queue.rotate(-left_count)  # 왼쪽으로 회전
            total_count += left_count
        else:
            queue.rotate(right_count)  # 오른쪽으로 회전
            total_count += right_count
            
        queue.popleft()  # 원하는 수를 큐에서 제거
    
    return total_count

# 입력 처리
n, m = map(int, input().split())
targets = list(map(int, input().split()))

print(min_rotation_count(n, targets))