# feat: 아파트 BOJ_32979.py
import sys
from collections import deque
inp = sys.stdin.readline

N = int(inp().rstrip())
T = int(inp().rstrip())

hands_list = inp().rstrip().split()
game_count = inp().rstrip().split()

losers = []

apt_queue = deque(hands_list)

for i in range(T):
    apt_queue.rotate(-int(game_count[i]) + 1)
    losers.append(apt_queue[0])

print(*losers)