from collections import deque

N = int(input())
cards = deque()
discarded = []

for i in range(1, N+1):
    cards.append(i)

while cards:
  discarded.append(cards.popleft())
  cards.rotate(-1)

for i in range(len(discarded)):
  print(discarded[i], end = " ")