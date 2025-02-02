import sys
from collections import deque


def find_loser(hand_position: deque[int], bj: list[int]) -> list[int]:
    losers = []

    # 교선이가 부르는 숫자만큼 루프
    for call in bj:
        # 숫자를 부른만큼 pop, push를 실행함
        for _ in range(call - 1):
            hand_position.append(hand_position.popleft())
        losers.append(hand_position[0])

    return losers


ip = sys.stdin.readline

n = int(ip())
t = int(ip())
hand_position = deque(list(map(int, ip().split())))
bj = list(map(int, ip().split()))

losers = find_loser(hand_position, bj)

print(" ".join(map(str, losers)))
