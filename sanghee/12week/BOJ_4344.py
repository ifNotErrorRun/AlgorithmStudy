# 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
# 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

# 출력
# 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
# 정답과 출력값의 절대/상대 오차는 10-3이하이면 정답이다.

import sys
C = int(sys.stdin.readline())

for i in range(C):
    scores_list = list(map(int, sys.stdin.readline().split())) # 점수 모음 리스트 만들기
    students_length = scores_list[0] # 리스트 요소 개수
    scores_list.remove(scores_list[0]) # 그냥 앞 요소 빼기? (근데 이럴 거면 왜 입력시켜..?)
    mean = sum(scores_list) / students_length # 한 줄 평균 계산

    student_passed = [] # 통과한 학생들 리스트 생성

    for j in range(students_length): # 통과한 학생들만 넣기
        if scores_list[j] > mean:
            student_passed.append(scores_list[j])

    students_passed_length = len(student_passed)
    percentage_passed = str(round(students_passed_length / students_length * 100, 3))

    print(percentage_passed + "%")
