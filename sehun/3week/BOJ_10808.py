def get_ascii_to_index(input: str) -> int:
    return ord(input) - 97


# 입력부
S: str = input()

# 알파벳 개수 저장용 배열
spell_list = [0 for i in range(26)]

# 계산처리
for char in S:
    spell_list[get_ascii_to_index(char)] += 1

# 출력
# '구분자'.join(형지정(배열값) for 배열값 in 배열)이용하여 정수형에서 문자열형으로 형변환 가능
# (join은 정수형에 사용 불가)
print(" ".join(str(s) for s in spell_list))
