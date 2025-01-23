#2
from collections import defaultdict
import sys
inp = sys.stdin.readline

N = int(inp().strip())

state = {
    "enter": 1,
    "leave": -1
}

score = defaultdict(int)
result = []

for _ in range(N):
    name, action = inp().split()

    # make sure name in
    if not score.get(name, None):
        score[name] = 0

    # enter
    if score[name] == 0 and state[action] == 1:
        score[name] += state[action]

    # leave
    if score[name] == 1 and state[action] == -1:
        score[name] += state[action]

for name, value in score.items():
    if value == 1:
        result.append(name)

for name in sorted(result, reverse=True):
    print(name)