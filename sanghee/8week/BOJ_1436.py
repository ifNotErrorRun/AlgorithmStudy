# https://www.acmicpc.net/problem/1436
# feat: 영화감독 숌 BOJ_1436.py

N = int(input())
the_number = 666
count = 0

while True:
  if "666" in str(the_number):
    count += 1

  if count == N:
    print(the_number)
    break

  the_number += 1