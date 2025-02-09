from collections import deque
import sys
input = sys.stdin.readline

N = int(input().strip())
q = deque()
max_len = 0      # 최대 길이 저장
max_student = 0  # 최대 길이일 때의 마지막 학생
curr_max_len = 0 # 현재 최대 길이

for _ in range(N):
    inputs = input().split()
    if inputs[0] == '1':
        student = int(inputs[1])
        q.append(student)
        if len(q) > max_len:
            max_len = len(q)
            max_student = q[-1]
        elif len(q) == max_len and q[-1] < max_student:
            max_student = q[-1]
    else:
        q.popleft()

print(max_len, max_student)