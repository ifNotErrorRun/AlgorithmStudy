def find_boundery(n):
    """삼각수의 경계값을 구하는 함수"""
    # 현재값
    current_value = 0
    # 계차(?) 차분(?)
    step = 1
    # 낮은부분 경계값(높은부분은 current_value)
    lower_bound = 1

    # 입력받은 수 n보다 현재값이 작을때 루프를 돔
    while current_value < n:
        # 현재값에 계차를 더해줌
        current_value += step
        # 현재값이 입력값과 같다면 경계의 최솟값과 최댓값, 계차를 return함
        if current_value >= n:
            return lower_bound, current_value, step
        # 같지않다면 다음 경계로 넘어가기때문에 현재경계의 최대값의 1을 더한 값을
        # 다음 경계값의 최소값으로 설정함.
        # 또한 계차도 증가해야하므로 1 더해줌
        lower_bound = current_value + 1
        step += 1


# 삼각수(계차수열)로 패턴을 끊어서 생각하기
# https://ko.wikipedia.org/wiki/%EC%82%BC%EA%B0%81%EC%88%98
n = int(input())

boundery = find_boundery(n)

# x축(?)으로 생각하기. 분자에 해당됨
x = n - boundery[0] + 1
# y축(?)으로 생각하기. 분모에 해당됨
y = boundery[2] - x + 1

# 출력함
# 단, 지금 실장법으로는 계차가 홀수일때와 짝수일때
# 분자와 분모를 바꿔주어야할 필요가 있음
if boundery[2] % 2 == 0:
    print(f"{x}/{y}")
else:
    print(f"{y}/{x}")
