x, y = map(int, input().split())

days_of_week = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]

# 각 month의 월요일 영점조절용(?)
# ex)   1월1일에서 다음월로 이동하면 기존 커서? 좌표?의 '일'에 아래의 값을 더해준다.
#       1월에서 2월로 이동시 --> 1일 + days_of_month[1]값을 일에다 더해주기 -> 2월 1+4일이 첫월요일

days_of_month = {
    1: 4,
    2: 0,
    3: 4,
    4: 5,
    5: 4,
    6: 5,
    7: 4,
    8: 4,
    9: 5,
    10: 4,
    11: 5,
    12: 4,
}
month = 1
day = 1

# 각 월의 첫번째주 월요일의 날짜 구하기
for i in range(0, x - 1):
    month += 1
    day += days_of_month[i + 1]
    if day > 7:
        day = day % 7

index = (y - day) % 7

print(days_of_week[index])
