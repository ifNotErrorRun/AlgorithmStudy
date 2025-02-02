from collections import deque
import sys
inp = sys.stdin.readline

N = int(inp().strip())
T = int(inp().strip())

hands = deque(map(int, inp().strip().split()))
CALLS = map(int, inp().strip().split())
loser = []

for call_number in CALLS:
    MOVES = call_number - 1

    # circular queue
    hands.rotate(-MOVES)
    # for _ in range(MOVES):
    #     hand = hands.popleft()
    #     hands.append(hand)

    # add person at the bottom
    loser.append(str(hands[0]))

print(" ".join(loser))