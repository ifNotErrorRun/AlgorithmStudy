import sys

while True:
    N, M = map(int, sys.stdin.readline().split())

    if N == 0 and M ==0:
        break

    sg_cd = set()
    sy_cd = set()

    for _ in range(N):
        sg_num = sys.stdin.readline().rstrip()
        sg_cd.add(int(sg_num))

    for _ in range(M):
        sy_num = sys.stdin.readline().rstrip()
        sy_cd.add(int(sy_num))

    print(len(sg_cd & sy_cd))
