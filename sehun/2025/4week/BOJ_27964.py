import sys

n = int(sys.stdin.readline().rstrip())
cheeses = sys.stdin.readline().split()
real_cheese = set()

for cheese in cheeses:
    if len(cheese) >= 6 and cheese[-6:] == "Cheese":
        real_cheese.add(cheese)

if len(real_cheese) >= 4:
    print("yummy")
else:
    print("sad")
