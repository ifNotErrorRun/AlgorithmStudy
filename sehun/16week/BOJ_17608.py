import sys

# 입력 케이스 수
n = int(sys.stdin.readline())
# 유효한 보더값(해당 값보다 작은 값이 들어오면 count를 해줌)
border = 0
# 보이는 막대기 수
count = 0
# 막대기 저장 배열
pushed_makdae = []

# 막대기 입력
for _ in range(n):
    pushed_makdae.append(int(sys.stdin.readline()))

for _ in range(n):
    # Remove the item at the given position in the list, and return it
    # https://docs.python.org/3/tutorial/datastructures.html
    # 파이썬의 list를 pop 할 경우 stack의 pop과 동일하게 FILO임
    temp = pushed_makdae.pop()

    # pop했는데 보더값보다 클 때
    if temp > border:
        count += 1
        border = temp

print(count)
