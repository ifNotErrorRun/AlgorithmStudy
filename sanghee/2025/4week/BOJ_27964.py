# 4주차 콰트로치즈피자
# https://www.acmicpc.net/problem/27964

import sys
inp = sys.stdin.readline

n = int(inp().rstrip())
toppings_list = list(inp().rstrip().split())

quattro_count = set()

# .endswith라는 멋진 메소드가 있음
for topping in toppings_list:
    if topping.endswith("Cheese"):
        quattro_count.add(topping)

if len(quattro_count) >= 4:
    print("yummy")

else:
    print("sad")