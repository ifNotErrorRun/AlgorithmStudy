# feat: 빠른 A+B BOJ_15552.py

import sys
def AB():

  count = int(input())

  for i in range(count):
    a, b = map(int, sys.stdin.readline().split())
    print(a+b)

AB()