# feat: 임스와 함께하는 미니게임 BOJ_25757.py

import sys
inp = sys.stdin.readline

N, game = inp().rstrip().split()
player_set = set()

for i in range(int(N)):
    # player = inp()
    player_set.add(input())

if game == 'Y':
    print(len(player_set))

elif game == 'F':
    print(len(player_set) // 2)

else:
    print(len(player_set) // 3)