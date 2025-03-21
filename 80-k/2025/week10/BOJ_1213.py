import sys
from collections import defaultdict
inp = lambda:sys.stdin.readline().rstrip()

# 문제 조건에 사전순으로 출력하여 *회문을 만들라는 조건이 있음.
# 회문에서는 홀수 갯수인 문자가 한개 이하로 존재 해야만 함.

S = inp()
letter = defaultdict(int)
# chractor
# count each character in string.
for c in S:
    letter[c] += 1

# 홀수 개수의 문자 카운트
odd_count = sum(1 for count in letter.values() if count % 2 == 1)

# 홀수 개수의 문자가 2개 이상이면 팰린드롬 불가능
if odd_count > 1:
    print("I'm Sorry Hansoo")
else:
    # 중간을 기준으로 앞부분.
    odd = None
    result = ''
    for k in sorted(letter.keys()):
        ctn = letter[k]
        if ctn % 2 == 1:
            odd = k
        if ctn != 1:
            result += k * (ctn//2)
            letter[k] -= ctn//2

    # 홀수 갯수의 문자가 있다면 중간에 위치.
    if odd:
        result += odd
        letter[odd] -= 1

    # 뒷부분
    for k in sorted(letter.keys(), reverse=True):
        result += (k * letter[k])

    print(result)
