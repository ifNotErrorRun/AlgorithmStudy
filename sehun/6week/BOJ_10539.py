N = int(input())
B = list(map(int, input().split()))

a_list = []
a_list.append(B[0])

for i in range(1, N):
    a_list.append(B[i] * (i + 1) - sum(a_list))

print(" ".join(map(str, a_list)))
