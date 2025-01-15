def calculate(cards, kill_flag):
    card_len = len(cards)
    if card_len == 1:
        print(cards[0])
        return

    # kill_flag가 True일 때는 짝수 인덱스를 0으로 바꿈
    if kill_flag:
        for i in range(0, card_len, 2):
            cards[i] = 0
    # kill_flag가 True일 때는 홀수 인덱스를 0으로 바꿈
    else:
        for i in range(1, card_len, 2):
            cards[i] = 0

    # 새로운 배열에 0이 아닌 값들을 차례로 넣음
    new_cards = [j for j in cards if j != 0]

    # 현재 루프의 초기 카드의 수가 2의 배수이면 kill_flag를 그대로, 아닐 때는 kill_flag를 뒤집음
    new_kill_flag = not kill_flag if card_len % 2 != 0 else kill_flag

    calculate(new_cards, new_kill_flag)


n = int(input())

cards = [i for i in range(1, n + 1)]
odd_even_flag = True

calculate(cards, odd_even_flag)
