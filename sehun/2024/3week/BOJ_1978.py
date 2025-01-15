def prime_list(end_num: int) -> list[int]:
    # 0부터 1001미만까지 1씩 증가하는 정수 리스트 생성
    # 소수일 경우 숫자 그대로, 소수가 아닐 경우 0을 대입
    num_list: list[int] = list(range(end_num))

    # 0과 1에 대해서는 판정안함
    num_list[0] = num_list[1] = 0

    for i in range(2, end_num):
        if num_list[i] != 0:
            # num_list[i]초과부터 1000까지 num_list[i]의 배수는 제거
            for j in range(i * 2, end_num, i):
                num_list[j] = 0

    return num_list


# 현재 로직으로는 N은 미사용(입력형식 맞추기 위해 만들어놓음)
N = int(input())
# 입력받은 값을 집합으로 변환
input_num_set: set[int] = set(list(map(int, input().split())))

# N은 1000이하의 자연수이므로 1000까지의 소수를 에라토스테네스의 체를 이용해 리스트를 구하고
# 그것을 집합으로 변환
prime_set: set[int] = set(prime_list(1001))

# 입력과 소수리스트의 교집합을 구함
result: set[int] = input_num_set & prime_set

# 출력(result의 길이)
print(len(result))
