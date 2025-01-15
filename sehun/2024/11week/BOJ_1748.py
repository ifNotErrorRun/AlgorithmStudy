import math

n = int(input())
# 로그함수로 n의 자리수 구하기...
digit_count = int(math.log10(n)) + 1
total_count = 0
result = 0

# 자리수를 그대로 계산에 이용하므로 1부터 digit_count+1까지 반복문 처리함
# 100일 경우 i = 0부터 시작이 아닌 i = 1, i = 2 이렇게 두번 루프함
for i in range(1, digit_count + 1):
    # 가장 큰 자리수일때
    if i == digit_count:
        # 입력받은 n에서 이때까지 처리한 누적값을 뺌
        jari_count = n - total_count
    # 마지막 자리수가 아닐 때
    else:
        # 각 자리마다 몇개있는지 구하는 식
        jari_count = 9 * 10 ** (i - 1)
        # 각 자리마다 몇개 처리했는지 저장
        total_count += jari_count
    # 각 자리별 계산하여 결과값에 합산
    result += jari_count * i

print(result)
