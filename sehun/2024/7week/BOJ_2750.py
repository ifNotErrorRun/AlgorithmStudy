# 별로 생각하고싶지 않으니 일단 버블정렬로 시간초과 나는지 확인

N = int(input())
number_list = [0] * N
for i in range(N):
    number_list[i] = int(input())

temp: int = 0
for i in range(len(number_list) - 1, 0, -1):
    for j in range(i):
        if number_list[j] > number_list[j + 1]:
            number_list[j], number_list[j + 1] = number_list[j + 1], number_list[j]

for num in number_list:
    print(num)
