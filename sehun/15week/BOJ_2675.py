# 입력
t = int(input())

# 처리, 출력
for _ in range(t):
    r, s = input().split()
    for char in s:
        # 파이썬의 print()는 기본적으로 행말에 "\n"가 추가되므로 end=""을 지정하여 개행이 되지 않도록 함
        print(char * int(r), end="")
    print()
