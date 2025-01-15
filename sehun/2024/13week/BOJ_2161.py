n = int(input())

cards = [i for i in range(1, n + 1)]
result = ""

while True:
    # 제일 위에있는 카드를 제거하고 result에 문자열 결합
    result += str(cards.pop(0)) + " "

    if len(cards) == 0:
        break

    # 그 다음에 있는 카드를 빼서 가장 뒤로 보관
    cards.append(cards.pop(0))

print(result)
