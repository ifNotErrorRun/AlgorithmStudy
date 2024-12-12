from collections import deque
import sys

N = int(sys.stdin.readline().strip())
cards = deque()

for i in range(1, N + 1):
  cards.append(i)

while len(cards) != 1:
  cards.popleft()
  cards.rotate(-1)

print(cards.popleft())