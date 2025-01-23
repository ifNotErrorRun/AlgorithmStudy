input_str = input()
sum = 0

for char in input_str:
    ascii = ord(char)
    # 7,9번 처리
    if ascii >= 83:
        ascii -= 1
    if ascii == 89:
        ascii -= 1

    target_num = int((ascii - 65) / 3) + 3
    sum += target_num

print(sum)
