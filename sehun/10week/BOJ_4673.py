# 입력받은 수에 대한 생성자를 return하는 함수
def get_ctor_num(input: int):
    # i를 str로 형변환하고 리스트로 변환한 뒤 반복문으로 각 자리수 뽑아온 뒤 int로 형변환하기
    jari = list(str(input))
    sum = 0
    result = 0
    for i in range(len(jari)):
        sum += int(jari[i])
    result = sum + input
    # 각 자리수 더한값과 원래값을 합하여 return
    if result > 10000:
        return 0
    else:
        return result


# 불리언 배열 이용
num_list = [False] * 10001
for i in range(10001):
    num_list[get_ctor_num(i)] = True

# 출력
for i in range(len(num_list)):
    if num_list[i]:
        pass
    else:
        print(i)
