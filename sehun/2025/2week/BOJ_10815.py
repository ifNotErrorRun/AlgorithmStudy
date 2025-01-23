import sys

# 각 값 입력
n = int(sys.stdin.readline())
n_list = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline())
m_list = list(map(int, sys.stdin.readline().split()))
# 딕셔너리 이용...
m_dict = {}

# 확인할 카드들을 0으로 초기화한 dict을 선언
for i in m_list:
    m_dict[i] = 0

# 위의 딕셔너리에서 상근의 카드가 key에 있다면 해당 value를 1로 바꿈
for n in n_list:
    if n in m_dict:
        m_dict[n] = 1

# 확인 리스트중 상근이 가지고 있는 카드는 1, 없는건 0이 되어있음
# 출력만 하면됨....
for m in m_dict:
    print(m_dict[m], end=" ")
