# # Binary search method
# import sys
# inp = lambda:sys.stdin.readline().rstrip()
# # 1 ≤ S ≤ 4,294,967,295

# S = int(inp())
# left = 1
# right = S

# result = 0
# while left <= right:
#     mid = (left + right) // 2
#     s = (mid * (mid+1)) // 2
#     if S >= s:
#         # 작을 때는 더 큰수를 골라서 합을 만들 수 있다.
#         # 예: S=20, 1+2+3+4+5=15 < 20
#         # 부족한 값은 5이지만, 5는 이미 사용했으므로 다시 사용할 수 없음
#         # 대신 마지막 수를 10으로 바꿔 1+2+3+4+10=20으로 만들 수 있음
#         result = mid
#         left = mid + 1
#     else:
#         right = mid - 1

# print(result)

# ---
# 이차방정식, 근의 공식을 활용
import sys
import math

S = int(sys.stdin.readline().rstrip())
N = int((-1 + math.sqrt(1 + 8 * S)) / 2)
print(N)