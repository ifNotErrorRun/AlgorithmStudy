# https://www.acmicpc.net/problem/2440
# feat: 별 찍기 - 3 BOJ_2440.java

import sys
N = int(sys.stdin.readline().strip())

def draw_stars(N):
  for i in range(N):
    print("*" * N)
    N -= 1

draw_stars(N)


# 주의사항 리스트

# 1. sys 임포트하는거 잊지 말기
# 2. sys.stdin.readline()은 개행을 가져옴 -> strip()을 반드시 추가