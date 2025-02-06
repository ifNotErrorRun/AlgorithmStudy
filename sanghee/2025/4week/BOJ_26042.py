# 4주차 식당 입구 대기 줄
# https://www.acmicpc.net/problem/26042

import sys
inp = sys.stdin.readline

n = int(inp().rstrip())
waiting_stack = []	#현재 대기줄
waiting_max = [0,0]

for _ in range(n):
    new_info = list(map(int,inp().rstrip().split()))
    if len(new_info) == 1:	# 2만 입력됨 - 식사 준비 완료
        waiting_stack.pop(0)	# 맨 앞 사람 식사
    else:
        waiting_stack.append(new_info[1]) # 줄 세우기

    if len(waiting_stack) > waiting_max[0]:	# 인원 최대치일 떄
        waiting_max[0] = len(waiting_stack)
        waiting_max[1] = waiting_stack[-1]

    elif waiting_max[0] == len(waiting_stack):	# 지금 줄이 인원 최대치일 때 학생 번호가 작은 쪽을 넣기
        waiting_max[1] = min(waiting_max[1], waiting_stack[-1])

print(waiting_max[0], waiting_max[1])