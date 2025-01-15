import sys
'''
    1. 3중 loop?
    2. 모든 경우의 수를 조합해보고 목표값과 가장 가까운 수를 마지막까지 들고가기
    3. 끝...???
'''
n, m = map(int, sys.stdin.readline().split())
num_list = list(map(int, sys.stdin.readline().split()))

approximate_value = 0

for i in range(0, n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            sum_result = num_list[i] + num_list[j] + num_list[k]
            if sum_result > m:
                continue
            if sum_result > approximate_value:
                approximate_value = sum_result
print(approximate_value)
