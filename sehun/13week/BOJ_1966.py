# https://stackoverflow.com/questions/717148/queue-queue-vs-collections-deque
# https://docs.python.org/3/library/collections.html#deque-objects
# 멀티쓰레딩 환경・구현이 아니라면 queue대신 deque를 사용해도 되는 듯?
# ↑사용해보니 deque가 쓰기 편함...
from collections import deque

# 입력
t = int(input())

# 테스트 수만큼 반복을 돌리면서 테스트값 입력받음
for _ in range(t):
    n, m = map(int, input().split())
    priorities = deque(list(map(int, input().split())))

    # 프린트? 출력순서?를 담는 변수
    count = 1

    while priorities:
        # 가장 첫번째 항목이 max값이 아니라면
        # 첫번째(left) 항목을 pop하고 제일 마지막으로 옮김
        if priorities[0] < max(priorities):
            # 확인 하고싶은 문서가 max값이 아닌데 출력 대상으로 와버렸다면 제일 뒤로 옮김
            if m == 0:
                m = len(priorities) - 1
            # 확인하고싶은 문서가 아니면 1만큼 당겨줌
            else:
                m -= 1
            priorities.append(priorities.popleft())

        # 가장 첫번째 항목이 max값이라면 출력처리를 함
        else:
            # m이 0일 때 원하는 출력대상 항목이므로 while으로부터 탈출함
            if m == 0:
                break
            # 아닐때는 출력처리를 하고 count++를 함
            # 또한 확인하고 싶은 순번(m)을 앞으로 한칸(-1)당겨줌
            else:
                priorities.popleft()
                count += 1
                m -= 1
    print(count)
