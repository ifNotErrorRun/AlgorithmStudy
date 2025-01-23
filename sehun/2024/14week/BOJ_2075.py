import sys
import heapq

# 입력값 받을 배열. 나중에 최소힙으로 변환됨
numbers = []
# ↑메모리 초과가 떠서 찾아보니 배열말고 set를 사용하면 중복이 제거되므로 메모리가
# 줄어들 수 있다고 해서 속아봄
# numbers_set = set()
# ↑또 메모리 초과가 떠서 찾아보니 힙의 크기를 n으로제한? 하면 된다고 함
# 그래서 그냥 numbers변수 다시 쓰기로 함...

# 힙 입력시 최소값 판별용
min_num = 0

# 입력
n = int(sys.stdin.readline())

# 표 입력
for i in range(n):
    # 노드가 n개인 최소힙에서 n번째로 큰 수는 최소힙의 이진트리 가장 꼭대기(?)값이 아닐까
    row = [int(x) for x in sys.stdin.readline().split()]

    # 첫줄 입력일때만 아래의 처리를 함(노드가 n개인 힙을 먼저 생성)
    if i == 0:
        numbers.extend(row)
        # 최소힙으로 변환
        heapq.heapify(numbers)
    # 노드가 n개인 힙이 생성된 뒤의 처리
    else:
        for number in row:
            # number가 numbers[0]더 큰값이면 number[0]을 pop하고 number를 새로 힙에 넣음
            if number > numbers[0]:
                heapq.heappushpop(numbers, number)


# n번째로 큰 수를 구해야하는데 노드수가 n개이므로 사실상 최소값이 정답임
print(heapq.heappop(numbers))
