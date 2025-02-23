import sys
inp = sys.stdin.readline

n, k = map(int, inp().split())
numbers_list = [True] * (n + 1)  # 크기를 n+1로 변경 [True가 0번부터 n번까지 존재 - 총 n+1개]

count = 0  # 지운 숫자 개수

end_flag = False

for i in range(2, n + 1):  # 2부터 n까지
    if numbers_list[i]:  # 아직 지워지지 않은 경우
        for j in range(i * 2, n + 1, i):  # i의 배수를 지우기
            if numbers_list[j]:  # 이미 지운 숫자는 다시 세지 않음
                numbers_list[j] = False
                count += 1

                if count == k:  # K번째로 지운 숫자를 찾으면 출력 후 종료
                    print(j)
                    end_flag = True
                    break

    if end_flag:
        break
