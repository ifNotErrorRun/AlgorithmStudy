def find_666(n):
    cnt = 0
    while n > 0:
        if n % 10 == 6:
            cnt += 1
        else:
            cnt = 0
        if cnt == 3:
            return True
        n = n // 10
    return False


N = int(input())
count = 0
temp = 1
num_list = []

while N != count:
    if find_666(temp):
        num_list.append(temp)
        count += 1
    temp += 1
print(num_list[-1])
