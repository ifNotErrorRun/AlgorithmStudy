import heapq
import sys
inp = sys.stdin.readline

N, M = map(int, inp().strip().split())
pq = list(map(int, inp().strip().split()))
heapq.heapify(pq)

for _ in range(M):
    x = heapq.heappop(pq)
    y = heapq.heappop(pq)

    fusion = x + y
    heapq.heappush(pq, fusion)
    heapq.heappush(pq, fusion)
print(sum(pq))