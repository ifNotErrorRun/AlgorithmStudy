# https://www.acmicpc.net/problem/2941
# feat: 크로아티아 알파벳 BOJ_2941.py

# 이거 그냥 특수 알파벳 기본 알파벳으로 변환하고 전체 갯수 세면 될거같음

chr_alphabet = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
word = input()

for i in chr_alphabet:
  word = word.replace(i, "a")

print(len(word))

#출력이 조건이면 print 함수 쓰는거 잊지 말기...