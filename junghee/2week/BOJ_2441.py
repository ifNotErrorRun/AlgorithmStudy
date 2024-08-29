# 변수 n의 값을 입력받습니다.
n = int(input("변수 n의 값을 입력하세요: "))

# n이 1 이상 100 이하인지 검사합니다.
if 1 <= n <= 100:
    # 최대 너비를 n의 시작 값으로 설정합니다.
    max_width = n
    
    # n이 1보다 큰 동안 반복합니다.
    while n > 1:
        # 아스탈리스크를 오른쪽 정렬하여 출력합니다.
        print(('*' * n).rjust(max_width))
        n -= 1
    
    # n이 1일 때 마지막으로 출력합니다.
    print('*'.rjust(max_width))
else:
    print("입력된 n의 값은 1 이상 100 이하가 아닙니다.")