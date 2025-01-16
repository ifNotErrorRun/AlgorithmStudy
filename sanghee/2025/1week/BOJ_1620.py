import sys

N, M = map(int, sys.stdin.readline().split())
pocketmons_dict = {}

for i in range(N):
  pocketmon = sys.stdin.readline().rstrip()
  pocketmons_dict[i+1] = pocketmon

reverse_dict = {value:key for key, value in pocketmons_dict.items()}

for _ in range(M):
  # 그냥 받은 값은 무조건 str임
  question = sys.stdin.readline().rstrip()
  if question.isdigit():
    print(pocketmons_dict.get(int(question)))
  else:
    print(reverse_dict.get(question))
    