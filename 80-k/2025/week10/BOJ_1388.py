from collections import defaultdict
import sys
inp = lambda:sys.stdin.readline().rstrip()

# 행:열
N, M =map(int, inp().split())

pattern = defaultdict(int)
pattern["-"] = 0
pattern["|"] = 0
board:list[str] = []

# get whole board info
for _ in range(N):
    board.append(inp())

# count vertial board
for i in range(N):
    target = "-"
    target_ctn = 0
    for j in range(M):
        if board[i][j] == target:
            target_ctn += 1
        elif target_ctn != 0:
            pattern[target*target_ctn] += 1
            target_ctn = 0
    if target_ctn != 0:
        pattern[target*target_ctn] += 1

# count horizontal board
for j in range(M):
    target = "|"
    target_ctn = 0
    for i in range(N):
        if board[i][j] == target:
            target_ctn += 1
        elif target_ctn != 0:
            pattern[target*target_ctn] += 1
            target_ctn = 0
    if target_ctn != 0:
        pattern[target*target_ctn] += 1

print(sum(pattern.values()))