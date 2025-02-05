import sys


n, m = map(int, sys.stdin.readline().split())
cards = list(map(int, sys.stdin.readline().split()))

for _ in range(m):
    cards.sort()
    temp = cards[0] + cards[1]
    cards[0] = temp
    cards[1] = temp

print(sum(cards))
