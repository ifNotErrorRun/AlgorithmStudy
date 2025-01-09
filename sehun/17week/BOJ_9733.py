import sys


def print_result(data: dict, total_task: int) -> None:
    for key, value in data.items():
        percent = value / total_task
        # formatted-string을 이용하여 출력
        # https://docs.python.org/3/tutorial/inputoutput.html#formatted-string-literals
        print(f"{key} {value} {percent:.2f}")
    print(f"Total {total_task} 1.00")


results = {
    "Re": 0,
    "Pt": 0,
    "Cc": 0,
    "Ea": 0,
    "Tb": 0,
    "Cm": 0,
    "Ex": 0,
}

# 꿀벌의 업무
works = []

# 업무 입력
for line in sys.stdin:
    if line.strip():
        works.extend(line.strip().split())

# 어떤 업무를 했는지 확인
# 근데 전혀 엉뚱한 문자열도 들어옴...
total_task = len(works)

# 입력받은 업무를 순회하여 dict에 기록
for work in works:
    for task, count in results.items():
        if task == work:
            results[task] += 1

# 출력
print_result(results, total_task)
