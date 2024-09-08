def print_all_value(list: list[int]) -> None:
    for value in list:
        print(value)


def input_value() -> list[int]:
    result = []
    for i in range(9):
        result.append(int(input()))
    return result


nan_list: list[int] = input_value()
nan_list.sort()

total: int = sum(nan_list)
overflowed_value = total - 100

for i in range(0, 9):
    for j in range(i + 1, 9):
        nan_duo_sum = nan_list[i] + nan_list[j]
        if overflowed_value == nan_duo_sum:
            nan_list.pop(i)
            nan_list.pop(j - 1)
            print_all_value(nan_list)
            exit(0)
