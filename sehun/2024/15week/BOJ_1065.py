# 한수이면 True 아니면 False를 return하는 함수
def hansu(num: int) -> bool:
    # 전처리
    temp = str(num)
    jari = []
    for char in temp:
        jari.append(int(char))

    # 한수체크
    # 2자리(1~99)까지는 모두 한수임
    if len(jari) < 3:
        return True
    else:
        d = 0
        for i in range(0, len(jari)):
            # 첫 루프때는 등차(d)를 구해야함
            if i == 0:
                d = int(jari[1]) - int(jari[0])
            # 등차를 구하고 난 뒤에는 각 항이 등차수열인지 체크 후 아니면 False를 return함
            else:
                if jari[i] - jari[i - 1] != d:
                    return False
    # 마지막까지 False가 return되지 않았다면 한수이므로 True를 return함
    return True


# 입력
n = int(input())
count = 0

for i in range(1, n + 1):
    if hansu(i):
        count += 1

print(count)
