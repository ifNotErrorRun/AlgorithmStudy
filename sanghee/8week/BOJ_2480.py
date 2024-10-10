# https://www.acmicpc.net/problem/2480
# feat: 주사위 세개 BOJ_2480.py

a, b, c = map(int, input().split())

if a == b == c:
  print(10000+a*1000)

elif a!=b and b!=c and c!=a:
  dice = [a, b, c]
  print(max(dice)*100)

else:
  cal = a-b

  if cal == 0:
    print(1000+a*100)

  else:
    print(1000+c*100)