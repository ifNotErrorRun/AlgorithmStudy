from collections import deque

# 값을 몇 번 받을지 지정
test_cases = int(input())

# 테스트 케이스 돌리기 시작
for i in range(test_cases):
  N, M = map(int, input().split())
  priorities = deque(map(int, input().split()))
  count = 0

  while priorities:
    priority_max = max(priorities)

    front = priorities.popleft()
    M -= 1

    if front == priority_max:
      count += 1

      if M < 0:
        print(count)
        break
      
    else:
      priorities.append(front)
      
      if M < 0:
        M = len(priorities) - 1