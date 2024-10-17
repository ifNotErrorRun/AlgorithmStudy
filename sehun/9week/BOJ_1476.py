e, s, m = map(int, input().split())
year = 1

# 각 조건중 하나라도 True인 경우 계속해서 루프를 돔
# 파이썬에서 정수를 논리연산에 사용하는 경우
# 0이 아닌 모든값은 True, 0은 False로 간주됨
# 따라서 아래의 경우 하나라도 True(0이 아닌경우)가 있다면 while을 계속해서 돌게 됨
while (year - e) % 15 or (year - s) % 28 or (year - m) % 19:
    year += 1

print(year)
