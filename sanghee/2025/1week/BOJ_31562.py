from collections import defaultdict
import sys

N, M = map(int, sys.stdin.readline().split())
original = {}

for _ in range(N):
  T, S, tone = map(str, sys.stdin.readline().split(maxsplit=2))
  original[tone] = S

answers = defaultdict(list)

# defaultdict의 사용법
for key, value in original.items():
  answers[key[:5]].append(value)

for _ in range(M):
  question = sys.stdin.readline().rstrip()
  if answers.get(question):
    if len(answers.get(question)) == 1:
      print(answers.get(question)[0])
    else:
      print("?")
  else:
    print("!")