import sys
from collections import deque

sikdang_line = deque()
max_line = 0
whos_last = ""
# 입력받기
n = int(sys.stdin.readline())


for _ in range(n):
    # n입력 다음줄부터 나오는 명령어? 테스트케이스?를 입력받고 배열로 변환
    input = sys.stdin.readline().split()

    # 배열의 길이가 1이라면(식사시작)
    if len(input) == 1:
        sikdang_line.pop()
    # 배열의 길이가 2라면(input[1]번 학생이 줄을 섬)
    else:
        sikdang_line.appendleft((input[1]))

    # 최대값이 여러번일 때 가장 작은 학생의 번호를 출력
    current_line = len(sikdang_line)
    if current_line > max_line:
        max_line = current_line
        whos_last = sikdang_line[0]
    elif current_line == max_line:
        whos_last = min(whos_last, input[1])

print(max_line, whos_last)
