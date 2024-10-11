# feat: 다이얼 BOJ_5622.py
# https://www.acmicpc.net/problem/5622


# 알파벳 입력 받아 문자 단위로 끊기
word = input()
word_list = list(word)

# 시간 초기화
time = 0
print(word_list)

# 아스키코드로 시간 더하기
for char in word_list:
  if 65 <= ord(char) <= 67:
    time += 3
  elif 68 <= ord(char) <= 70:
    time += 4
  elif 71 <= ord(char) <= 73:
    time += 5
  elif 74 <= ord(char) <= 76:
    time += 6
  elif 77 <= ord(char) <= 79:
    time += 7
  elif 80 <= ord(char) <= 83:
    time += 8
  elif 84 <= ord(char) <= 86:
    time += 9
  else:
    time += 10

print(time)