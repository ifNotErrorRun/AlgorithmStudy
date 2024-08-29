row_num = int(input())
whitespace_count = 0

for i in range(row_num, 0, -1):
    print(f"{' ' * whitespace_count}{i * '*'}")
    whitespace_count += 1
