# 해결 방법에 차이가 없음..?
# feat: 피보나치 수 BOJ_2747.py

n = int(input())
if (n == 1 or n == 2):
  print(1)

else:
  a, b = 1, 1
  for i in range(3, n + 1):
    a, b = b, a + b
  print(b)