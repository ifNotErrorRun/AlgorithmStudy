# feat: 단어순서 뒤집기 BOJ_12605.py

N = int(input())

for i in range(N):
  case_contents = list(input().split())
  case_length = len(case_contents)
  case_number = str(i + 1)

  print("Case #" + case_number + ": ", end = '')
  for _ in range(case_length):
    print(case_contents.pop(), end = ' ')