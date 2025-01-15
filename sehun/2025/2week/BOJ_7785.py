import sys

"""
처음 시도한 로직...
아래의 경우는 enter의 집합과 leave 집합을 각각 준비하여
leave인 경우, leaved_list에 이름을 추가
enter인 경우, entered_list에 이름을 추가하여
입장set - 퇴장set을 하여 (차집합) 결과값을 역순정렬하여 출력하려고 하였음

결과적으로 출근-퇴근-재출근의 경우 위의 로직에서는 에러가 발생함

n = int(sys.stdin.readline())
entered_list = set()
leaved_list = set()

for _ in range(n):
    name, status = sys.stdin.readline().split()
    if status == "enter":
        entered_list.add(name)
    else:
        leaved_list.add(name)

result = entered_list - leaved_list

print("\n".join(sorted(list(result), reverse=True)))
"""
# 테스트 케이스 수
n = int(sys.stdin.readline())
# 근태기록용 dict
kintai = {}

# 근태처리....
for _ in range(n):
    # 이름은 중복이 없다고 하니 굳이 set을 쓸 이유가 없었음
    # key를 이름으로 하고 value를 0과 같은 더미를 넣고
    # enter일 때 {이름: 0}을 추가하고, leave일 때 해당하는 이름을 제거하면 될 것 같음
    # ↑처음부터 leave가 나오면 에러가 발생하나..?? 일단 그런 경우가 나오는지는 알 수 없으므로 일단 구현
    # ↑없었나봄
    name, status = sys.stdin.readline().split()
    if status == "enter":
        kintai[name] = 0
    else:
        del kintai[name]

# key만 뽑아와서 역순정렬하고 개행문자를 구분자로 하여 문자열 결합하여 출력
print("\n".join(sorted(kintai.keys(), reverse=True)))
