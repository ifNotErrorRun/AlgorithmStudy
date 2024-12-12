import sys
import heapq

# 입력
n = int(input())

# 힙
santabox = []

# 산타할아방탱이 이동경로 입력
for _ in range(n):
    route = [-int(x) for x in sys.stdin.readline().split()]

    # 애기들 만났을 때
    if route[0] == 0:
        if len(santabox) == 0:
            print(-1)
        else:
            print(-heapq.heappop(santabox))
    # 보급소 만났을 때
    else:
        for i in range(len(route)):
            if i == 0:
                pass
            else:
                heapq.heappush(santabox, route[i])
