# feat: 국회의원 선거 BOJ_1417.py

import heapq

N = int(input())
Dasom = int(input())

candidates = []
bribes = 0

# 경쟁자가 없는 경우엔 매수 안해도 됨
if N ==1 :
  print(bribes)

else:
  # 최대 힙 구현
  for _ in range(N-1):
    votes = int(input())
    heapq.heappush(candidates,-votes)

  most_supported = heapq.heappop(candidates)

  # 최다 득표자 m이 있을 때 - 뇌물 +1 / 다솜 +1 / m은 -1 (구현상 +1) / m은 다시 뽑기
  while (-most_supported >= Dasom) :
    bribes += 1
    Dasom += 1
    heapq.heappush(candidates, most_supported + 1)
    most_supported = heapq.heappop(candidates)

  print(bribes)