import heapq

n = int(input())
# 다솜이 예상 득표수
dasom_votes = 0
# 다솜이 제외 후보자들 예상 득표수
expected_votes = []
# 다솜이가 매수한 표
dasom_money_count = 0

# 다솜이의 표는 힙에 넣지 않고 별도로 관리함
for i in range(n):
    if i == 0:
        dasom_votes = int(input())
    else:
        expected_votes.append(int(input()))

# https://docs.python.org/ko/3/library/heapq.html#heapq.heapify
# https://velog.io/@yyj8771/Python-heapq를-이용한-최소-힙-최대-힙
# heapq모듈을 이용해서 이진트리로 변환함
# 단 위의 모듈은 최소힙으로밖에 만들 수 없으므로 최대힙을 만들기 위해서는 부호를 뒤집을 필요성이 있음

max_heap = [-n for n in expected_votes]
heapq.heapify(max_heap)

# 가장 힙의 최대값이 다솜이가 매수한 표보다 크다면 루프함
# max_heap이 비어있는 조건을 넣지않으면 에러가 발생함...
while max_heap and -max_heap[0] >= dasom_votes:
    # 힙에서 가장 득표를 많이한 후보자의 표를 꺼냄
    max_votes = -heapq.heappop(max_heap)

    # 후보자의 표를 하나 줄이고 다솜이에게 옮김
    max_votes -= 1
    dasom_votes += 1

    # 다솜이가 매수한 표++해줌
    dasom_money_count += 1

    # 30행에서 꺼냈던 후보자를 다시 힙에 넣음
    heapq.heappush(max_heap, -max_votes)

print(dasom_money_count)
