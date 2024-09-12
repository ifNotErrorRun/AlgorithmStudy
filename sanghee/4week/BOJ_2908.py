# feat: 상수 BOJ_2908.py

# import sys
# a, b = map(int, sys.stdin.readline().split())

a, b = input().split()
list_A = list(a)
list_B = list(b)

list_A.reverse()
list_B.reverse()

reverse_a = int(''.join(list_A))
reverse_b = int(''.join(list_B))

print(max(reverse_a, reverse_b))