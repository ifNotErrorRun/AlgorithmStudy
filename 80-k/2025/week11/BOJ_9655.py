import sys
inp = lambda: sys.stdin.readline().rstrip()

INF = float('inf')

## 문제
#상근이가 게임을 이기면 SK를, 창영이가 게임을 이기면 CY을 출력한다.
#돌은 1개 또는 3개 가져갈 수 있다. 

## 이해
#상근이가 선공, 창영이가 후공이다.
#상근이는 돌을 1개 또는 3개 가져갈 수 있고, 창영이도 마찬가지이다.

## 결론
# N이 홀수이면 선공(상근이), 짝수이면 후공(창영이)가 승리.
N = int(inp())
print("SK" if N % 2 == 1 else "CY")


## 방법2
# --- min-max game algo
# player = -1 # go first

# def find_actions(state):
#     actions = []
#     for i in [1, 3]:
#         if state - i >= 0:
#             actions.append(i)
#     return actions

# def is_terminal(state):
#     return state == 0 or len(find_actions(state)) <= 0

# def utility(loser):
#     if loser == -1:
#         return 1
#     else:
#         return -1
    
# def take_action(state, action):
#     new_state = state - action
#     if new_state < 0:
#         print("Invalid action !!!", action)
#         exit()
#     return new_state

# def min_max(state, player, alpha, beta):
#     if is_terminal(state):
#         # no more actions to be able to take
#         return utility(-player) # player lost. -player to get winner.

#     if player == -1:
#         max_value = -INF
#         for action in find_actions(state):
#             v = min_max(take_action(state, action), -player, alpha, beta)
#             max_value = max(max_value, v)
#             alpha = max(alpha, max_value)
#             if alpha >= beta:
#                 break
#         return max_value
#     else:
#         min_value = INF
#         for action in find_actions(state):
#             v = min_max(take_action(state, action), -player, alpha, beta)
#             min_value = min(min_value, v)
#             beta = min(beta, min_value)
#             if alpha >= beta:
#                 break
#         return min_value

# if __name__ == "__main__":
#     n = int(inp())

#     while True:
#         # keep gaming until ti reaches to is_terminal()
#         max_value = -INF
#         action_to_take = None
#         for action in find_actions(n):
#             v = min_max(take_action(n, action), player, -INF, INF)
#             if v > max_value:
#                 max_value = v
#                 action_to_take = action

#         # perform a chosen action
#         n -= action_to_take

#         # 게임 종료 확인.
#         if is_terminal(n):
#             print("SK" if player == -1 else "CY")
#             exit()
                
#         # 턴 종료 및 플레이어 전환
#         player = -player