import sys

# 테스트 케이스
n, game_type = sys.stdin.readline().split()
# 게임 참가자(중복불가)
players = set()
# 임스를 제외하고 게임에 필요한 인원수
game_players = {"Y": 1, "F": 2, "O": 3}

# 플레이어 참가신청 입력
for _ in range(int(n)):
    players.add(sys.stdin.readline())

# 게임참가자를 / 임스를 제외한 필요 인원수 = 플레이 가능한 게임수
print(int(len(players) / game_players[game_type]))
