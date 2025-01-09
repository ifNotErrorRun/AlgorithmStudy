from collections import defaultdict

N, M = map(int, input().split())
original = {}

for _ in range(N):
  T, S, tone = map(str, input().split(maxsplit=2))
  original[tone] = S

answers = defaultdict(list)

# defaultdict의 사용법
for key, value in original.items():
  answers[key[:5]].append(value)

for _ in range(M):
  question = input()
  if answers.get(question):
    if len(answers.get(question)) == 1:
      print(answers.get(question)[0])
    else:
      print("?")
  else:
    print("!")