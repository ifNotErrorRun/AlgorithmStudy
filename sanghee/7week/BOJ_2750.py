# https://www.acmicpc.net/problem/2750
# feat: 수 정렬하기 BOJ_2750.py

count = int(input())
num_list = []

for i in range(count):
  num = int(input())
  num_list.append(num)

num_list.sort(reverse=False)

for i in num_list:
  print(i)