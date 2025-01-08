# feat: 막대기 BOJ_17608.py
# 리스트의 끝부터 최댓값 모음집(?)을 만들어야 할 듯
# 결국 끝자락부터 봐서 가장 큰 값을 기준으로 두고 그거보다 크면 보이는 거임

import sys

N = int(sys.stdin.readline())
bars = []
visible_bars = []

for _ in range(N):
    h = int(sys.stdin.readline())
    bars.append(h)

last_bar = bars.pop()
visible_bars.append(last_bar)

# N-1인 이유: N이면 pop을 n번 해야 함 (이미 위에서 pop을 한번 해 서 원소가 N-1개라 불가능) 
for i in range(N-1):
    temp_bar = bars.pop()

    if temp_bar > last_bar:
        visible_bars.append(temp_bar)
        last_bar = temp_bar
    
    else:
        continue

print(len(visible_bars))