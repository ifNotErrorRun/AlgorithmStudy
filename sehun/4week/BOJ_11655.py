def encrypt(input: str) -> None:
    result = ""
    for c in input:
        result += convert_rot13(ord(c), spell_checker(c))
    print(result)


def spell_checker(char: str) -> int:

    if char.isupper():
        return 0
    elif char.islower():
        return 1
    else:
        return 2


def convert_rot13(ascii: int, flag: int) -> str:
    ascii_range = [90, 122]
    if flag == 2:
        return chr(ascii)
    else:
        result_ascii = ascii + 13
        if result_ascii > ascii_range[flag]:
            result_ascii -= 26

        return chr(result_ascii)


# 입력받기
S = input()

# 받은 문자열 반복문 돌기
encrypt(S)
