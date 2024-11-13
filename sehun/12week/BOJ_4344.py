def calc_row(scores: list[int]) -> None:
    # 전달받은 리스트에서 0번째 항목은 사실상 불필요하기에 pop으로 제거함
    # 일단 pop된 숫자는 학생수이므로 변수에 담아둠
    students_count = scores.pop(0)

    # 총점, 평균, 평균넘는학생 카운트용 변수 선언, 0으로 초기화
    sum = avg = count = 0

    # 학생들의 점수 총합 구하기(평균값을 구할 때 이용)
    for score in scores:
        sum += score

    # 평균값 구하기
    avg = sum / students_count

    # 평균값 넘는 학생들 카운트
    for score in scores:
        if score > avg:
            count += 1

    result = count / students_count

    # f-string으로 성형출력
    # https://docs.python.org/ko/3/tutorial/inputoutput.html
    print(f"{result:.3%}")


c = int(input())

for i in range(c):
    # 각 테스트케이스의 입력을 정수배열로 변환하여 함수에 전달함
    calc_row(list(map(int, input().split())))
