def find_score(count_list, max_count, base_score, increment_score):
    for i in range(6, 0, -1):
        if count_list[i - 1] == max_count:
            return base_score + i * increment_score


def calculate_score(dice_list):
    dice_count_list = [0] * 6

    for dice in dice_list:
        dice_count_list[dice - 1] += 1

    max_count = max(dice_count_list)

    match max_count:
        case 1:
            return find_score(dice_count_list, 1, 0, 100)
        case 2:
            return find_score(dice_count_list, 2, 1000, 100)
        case 3:
            return find_score(dice_count_list, 3, 10000, 1000)


dice_list = list(map(int, input().split()))
print(calculate_score(dice_list))
