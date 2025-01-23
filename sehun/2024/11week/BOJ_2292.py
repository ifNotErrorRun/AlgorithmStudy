n = int(input())
border = 1
count = 1

while n > border:
    border += 6 * count
    count += 1

print(count)
