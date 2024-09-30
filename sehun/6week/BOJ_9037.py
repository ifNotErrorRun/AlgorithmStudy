def candy_checker(candies: list[int]) -> list[int]:
    for i in range(len(candies)):
        if (candies[i] % 2) != 0:
            candies[i] += 1
    return candies


def socialism_teacher_makes_students_to_be_a_communist(candies):
    n = len(candies)
    half_candies = [c // 2 for c in candies]
    red_colored_candies = [0] * n

    for i in range(n):
        red_colored_candies[i] = candies[i] - half_candies[i] + half_candies[i - 1]

    candy_checker(red_colored_candies)
    return red_colored_candies


# 테스트 케이스 수
T = int(input())

for i in range(T):
    # 아이의 인원
    N = int(input())
    # 초기 사탕수
    C = list(map(int, input().split()))

    candy_checker(C)
    count = 0
    while len(set(C)) > 1:
        C = socialism_teacher_makes_students_to_be_a_communist(C)
        count += 1
    print(count)
