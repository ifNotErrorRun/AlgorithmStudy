number_list = list(map(int, input().split()))

"""
# 내장함수 sort() 이용
number_list.sort()
"""

"""
# 버블정렬
temp: int = 0
for i in range(len(number_list) - 1, 0, -1):
    for j in range(i):
        if number_list[j] > number_list[j + 1]:
            number_list[j], number_list[j + 1] = number_list[j + 1], number_list[j]

print(number_list[1])
"""

# 정렬없이 탐색
first, second = 0, 0

for number in number_list:
    # 리스트에서 꺼낸값이 최댓값(first)보다 클 때
    # 기존 first값을 second로 옮기고 first는 리스트에서 꺼낸 값을 할당
    if number >= first:
        second = first
        first = number
    # 최대값은 아니지만 두번째로 큰 값(second)보다는 클 때
    # second에 리스트에서 꺼낸 값을 할당
    elif first > number > second:
        second = number
print(second)

# print(sorted(map(int, input().split()))[1])
