import sys
inp = sys.stdin.readline

N, M = map(int, inp().strip().split())
while True:
    ab = set()
    a = []
    b = []

    # first person
    for _ in range(N):
        number = int(inp().strip())
        a.append(number)
        ab.add(number)

    # second person
    for _ in range(M):
        number = int(inp().strip())
        b.append(number)
        ab.add(number)

    # print how many same numbers
    print((len(a) + len(b)) - len(ab))

    # check if no more test-case
    N, M = map(int, inp().strip().split())
    if N == 0 and M == 0:
        # test case ends
        exit()
    else:
        continue

# set
# 공통 부분(교집합)을 구하기
# # & 연산자 사용
# set1 = {1, 2, 3, 4}
# set2 = {3, 4, 5, 6}
# common = set1 & set2  # {3, 4}
# common = set1.intersection(set2)  # {3, 4}
# set1.intersection_update(set2)  # set1이 교집합으로 업데이트됨
# # 이제 set1 = {3, 4}