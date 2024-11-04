def input_validator(input: str) -> str:
    if not check_first(input):
        return f"<{input}> is not acceptable."
    if not check_second(input):
        return f"<{input}> is not acceptable."
    if not check_third(input):
        return f"<{input}> is not acceptable."

    return f"<{input}> is acceptable."


def vowol_cheker(input: str):
    return any(char in "aeiou" for char in input)


def check_first(input: str):
    return vowol_cheker(input)


def check_second(input: str):
    # 자모음 각각 3개 연속해서 나오는지 체크
    vowol_count = 0
    cons_count = 0
    for char in input:
        # 모음일 때 vowol_count++, cons_count는 초기화
        if vowol_cheker(char):
            vowol_count += 1
            cons_count = 0
        # 자음일 때 vowol_count초기화, cons_count++
        else:
            vowol_count = 0
            cons_count += 1

        if vowol_count == 3 or cons_count == 3:
            return False

    return True


def check_third(input: str):
    # 같은 문자 체크(단 'ee', 'oo'는 예외)
    for i in range(len(input) - 1):
        # 같은 문자일 때
        if input[i] == input[i + 1]:
            if input[i : i + 2] not in ["ee", "oo"]:
                return False
    return True


while True:
    input_str = input()
    if input_str == "end":
        exit(0)

    print(input_validator(input_str))
