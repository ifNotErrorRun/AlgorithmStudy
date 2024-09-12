#https://www.acmicpc.net/problem/10872
#feat: 팩토리얼 BOJ_10872.py

# 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

# 입력
# 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

# 출력
# 첫째 줄에 N!을 출력한다.

N = int(input())

def factorial(N):
  temp = 1

  while N > 0:
    temp *= N
    N -= 1
  print(temp)

factorial(N)