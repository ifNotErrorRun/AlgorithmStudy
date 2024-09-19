# https://www.acmicpc.net/problem/2455
# feat: 지능형 기차 BOJ_2455.java

# import sys

InOut_list = []
train_sum = 0

for i in range(4):

  # a, b = map(int, sys.stdin.readline().split())
  # train_sum = train_sum + b - a

  a, b = input().split()
  train_sum = train_sum + int(b) - int(a)
  InOut_list.append(train_sum)

print(max(InOut_list))