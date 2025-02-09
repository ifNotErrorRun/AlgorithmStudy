from collections import defaultdict
import sys
input = sys.stdin.readline

N = int(input().strip())
board = defaultdict(int)

for _ in range(N):
    book = input().strip()
    board[book] += 1

# 2. max() 함수 활용 가능
print(min(board.keys(), key=lambda k: (-board[k], k) ))