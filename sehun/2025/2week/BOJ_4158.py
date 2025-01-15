import sys

# 입력이 "0 0"이 나올 때 까지 무한루프
while True:
    n, m = map(int, sys.stdin.readline().split())
    # 파이썬에서 0은 False, 0 이외의 정수는 True로 처리됨
    # 따라서 아래의 경우는 n,m 모두 0인 경우 break를 하게됨
    if not n and not m:
        break

    n_list = set()  # 상근소유CD
    m_list = set()  # 선영소유CD

    # 상근
    for _ in range(n):
        n_list.add(sys.stdin.readline())

    # 선영
    for _ in range(m):
        m_list.add(sys.stdin.readline())

    # 상근이와 선영이가 가지고 있는 cd의 교집합을 구하고 교집합의 길이를 출력함
    # 근데 문제 출력 관련 설명이 좀 부족한듯....
    print(len(n_list & m_list))
