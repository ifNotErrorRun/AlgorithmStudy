def cloud_checker(cloud_list: str) -> None:
    # 출력 저장용
    result_list: list[int] = []
    # 구름이 도착 하기 까지 걸리는 시간 누적값
    accumulator: int = 0
    # 구름이 나타 났는지에 대한 flag
    cloud_flag = False

    # 각 구역을 왼쪽지역부터 오른쪽지역 순으로 처리
    for cloud in cloud_list:
        if cloud == "c":
            # 현재지역에 구름이 나타났으므로 cloud_flag를 True로 설정
            cloud_flag = True
            # 누적값 초기화(이전에 구름이 생성되었을 경우를 대비하여 이 값을 초기화 하여야 함)
            accumulator = 0
            # 현재지역이 구름인 경우 출력값은 0이므로 출력저장용 배열에 저장
            result_list.append(0)
        else:
            # 이전지역에 구름이 있으면 누적값 +1
            if cloud_flag:
                accumulator += 1

            if accumulator == 0:
                # 이전지역에 구름이 없으면(누적값이 0이면) 출력값은 -1이므로 출력저장용 배열에 저장
                result_list.append(-1)
            else:
                # 이전지역에 구름이 있으면(누적값이 0이 아니면) 출력값은 누적값이므로 출력저장용 배열에 저장
                result_list.append(accumulator)
    # 정수배열을 문자열로 바꾼 뒤 공백문자를 구분자로 사용하여 하나의 문자열로 합친 뒤 출력
    print(" ".join((str(s) for s in result_list)))


# 입력
H, W = map(int, input().split())

# 구름정보를 한줄씩 받고 처리(출력)
for i in range(H):
    row_input: str = input()
    cloud_checker(row_input)
