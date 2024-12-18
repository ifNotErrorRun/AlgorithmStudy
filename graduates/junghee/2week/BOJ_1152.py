# 입력 받기
x, y = map(int, input().split())

# 2007년의 각 월의 일수 설정
days_in_month = {
    1: 31, 2: 28, 3: 31, 4: 30, 5: 31, 6: 30,
    7: 31, 8: 31, 9: 30, 10: 31, 11: 30, 12: 31
}

# 2007년 1월 1일 월요일 (MON)에서 시작
base_weekday = 0  # 0: MON

# 날짜의 총 일 수 계산
days_from_start = 0

# 주어진 월의 이전 월들의 총 일수 계산
for month in range(1, x):
    days_from_start += days_in_month[month]

# 주어진 월의 일수 계산
days_from_start += (y - 1)  # y일이기 때문에 (y - 1)일

# 요일 계산
weekday = (base_weekday + days_from_start) % 7

# 요일 매핑
weekdays = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]

# 결과 출력
print(weekdays[weekday])