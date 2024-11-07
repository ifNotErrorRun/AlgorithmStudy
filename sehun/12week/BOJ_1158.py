n, k = map(int, input().split())

# 원형큐?를 구현한다면 가능하지 않을까...
# 그냥 인덱스 번호만 잘 구해서 해보기
# 찾아보니 원형큐보다는 연결리스트가 더 좋다고는 하는데 그냥 풀기.....


# 학생번호(?)를 붙혀서 배열초기화
students = [i for i in range(1, n + 1)]
# 제거할 사람을 가리키는 포인터(?)
pointer = 0
# 결과값을 담을 리스트
result = []

# students가 비어 있지 않은 동안 while루프함
while students:
    # 대상항목을 지정할 포인터 구하기
    pointer = (pointer + k - 1) % len(students)
    # 대상항목 제거하기
    result.append(students.pop(pointer))


# 출력
print(f"<{', '.join(map(str, result))}>")
