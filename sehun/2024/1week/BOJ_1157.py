import sys

input_line: str = sys.stdin.readline().rstrip().upper()
spell_count_list = [0] * 26
max_count = 0
max_spell = 0
jb_flag = False

for char in input_line:
    index = ord(char) - 65
    spell_count_list[index] += 1

for i in range(0, 26):
    if spell_count_list[i] == 0:
        continue
    elif spell_count_list[i] > max_count:
        max_count = spell_count_list[i]
        max_spell = i
        jb_flag = False
        continue
    elif max_count == spell_count_list[i]:
        jb_flag = True

print('?' if jb_flag else chr(max_spell + 65))
