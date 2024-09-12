train = 0
max = 0

for i in range(4):
    left, borded = map(int, input().split())
    train += borded
    train -= left

    if train > max:
        max = train

print(max)
