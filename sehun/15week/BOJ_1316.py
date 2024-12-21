n = int(input())
count = 0

for _ in range(n):
    # 기본값 0, 그룹단어 1, 그룹단어 아님 -1
    spell_list = [0 for i in range(26)]

    # 각 단어는 소문자로 주어지기 때문에 별도의 전처리(대/소문자 변환)가 필요없음
    word = input()
    for i in range(len(word)):
        index = ord(word[i]) - 97
        # 알파벳이 처음 나왔을 때
        if spell_list[index] == 0:
            spell_list[index] = 1
        # 두번째로 나올 때
        elif spell_list[index] == 1:
            if word[i] == word[i - 1]:
                pass
            else:
                spell_list[index] = -1

    if spell_list.count(-1) == 0:
        count += 1

print(count)
