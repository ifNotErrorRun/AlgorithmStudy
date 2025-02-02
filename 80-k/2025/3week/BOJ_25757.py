import sys
inp = sys.stdin.readline

# 신청 횟수, 신청 게임
N, G = inp().strip().split()
game_required = {"Y":2, "F":3, "O":4}
played_name = set()
people_in_que = 0
played_game = 0

for _ in range(int(N)):
    name = inp().strip()
    if name not in played_name:
        played_name.add(name)
        people_in_que += 1

        if people_in_que >= game_required[G] - 1:
            played_game += 1
            people_in_que = 0
print(played_game)

# count number of players including me