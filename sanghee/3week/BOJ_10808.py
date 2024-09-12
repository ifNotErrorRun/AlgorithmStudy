# https://www.acmicpc.net/problem/10808
# feat: 알파벳 개수 BOJ_10808.py

# 문제
# 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.

# 입력
# 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

# 출력
# 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.

S = input()

def alph_count(S):
  count = {}

  for char in 'abcdefghijklmnopqrstuvwxyz':
    count[char] = 0

  for char in S:
    if char in count:
      count[char] += 1

  for num in count.values():
    print(num, end = ' ')

alph_count(S)