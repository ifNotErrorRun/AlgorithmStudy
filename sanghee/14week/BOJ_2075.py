# feat: N번째 큰 수 BOJ_2075.py

import heapq

N = int(input())
numbers_heap = []

for _ in range(N):
    temp_list = list(map(int, input().split()))

    if not numbers_heap:
      for num in temp_list:
        heapq.heappush(numbers_heap, num)
    
    else:
      for num in temp_list:
        number_N = heapq.heappop(numbers_heap)
        if number_N < num:
          heapq.heappush(numbers_heap, num)
        else:
          heapq.heappush(numbers_heap, number_N)

print(heapq.heappop(numbers_heap))