import sys
input = sys.stdin.readline

KEYWORD = "Cheese"
# number of required different cheeses
MIN_CHEESES = 4
# toppings
N = int(input().strip())

# check if we have more than 4 different cheeses
toppings = { topping for topping in input().strip().split() if topping.endswith(KEYWORD)}
print("yummy" if len(toppings) >= MIN_CHEESES else "sad")