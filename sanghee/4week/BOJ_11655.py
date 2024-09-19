# https://www.acmicpc.net/problem/11655
# feat: ROT13 BOJ_11655.py

original = input()
original_list = list(original)

# 공백이 아닐 경우 아스키코드로 변환 > (대문자: 65~90, 소문자: 97~122) 범위만 13 더하기

for i in range(len(original_list)):
  if (65 <= ord(original_list[i]) <= 77) or (97 <= ord(original_list[i]) <= 109):
    original_list[i] = chr(ord(original_list[i]) + 13)
  
  elif (78 <= ord(original_list[i]) <= 90) or (110 <= ord(original_list[i]) <= 122):
    original_list[i] = chr(ord(original_list[i]) + 13 - 26)

print(''.join(original_list))