# import sys
# inp = lambda:sys.stdin.readline().rstrip()
# # 지민이가 가지고 있는 막대의 길이를 모두 더한다.
# # 처음에는 64cm 막대 하나만 가지고 있다.
# total = [64]
# X = int(inp())
# while sum(total) > X:
#     #이때, 합이 X보다 크다면, 아래와 같은 과정을 반복한다.
#     most_short = total.pop()
#     # 가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
#     if sum(total) + (most_short / 2) >= X:
#         # 만약, 위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 X보다 크거나 같다면, 위에서 자른 막대의 절반 중 하나를 버린다.
#         total.append(most_short / 2)
#     else:
#         total.append(most_short / 2)
#         total.append(most_short / 2)
# print(len(total))
# 이제, 남아있는 모든 막대를 풀로 붙여서 Xcm를 만든다.
# X가 주어졌을 때, 위의 과정을 거친다면, 몇 개의 막대를 풀로 붙여서 Xcm를 만들 수 있는지 구하는 프로그램을 작성하시오. 

# 32 -> 10111
import sys
inp = lambda:sys.stdin.readline().rstrip()

X = int(inp())
ctn = 0
while X:
    ctn += X & 1
    X >>= 1
print(ctn)