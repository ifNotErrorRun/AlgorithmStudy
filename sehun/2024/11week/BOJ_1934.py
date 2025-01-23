# 출력
def get_lcm(a: int, b: int) -> None:
    # 검색해보니 유클리드 호재법이라는게 있어서 구현함

    # 정의
    # a와 b의 최소공배수(lcm)는 a와 b를 곱한 값에서 a와 b의 최대공약수(gcd)를 나눈것과 같다

    # 예시
    # a =10, b = 6, gcd = 2인 경우
    # 최소공배수는 10 * 6 / 2 = 30이 된다

    # 구현
    result = (a * b) // get_gcd(a, b)
    print(result)


def get_gcd(a: int, b: int) -> int:
    # 최대공약수 구하는법
    # a>b의 경우 a를 b로 나눈 나머지를 r이라고 할 때 a와 b의 최대공약수는 b와 r의 최대공약수와 같다
    # r=0 이라면 a,b의 최대공약수는 b가된다

    # 예시
    # gcd(a, b)=gcd(b, r)
    # a = 10, b = 6일 경우
    #       gcd     a       b       a%b
    #   gcd(10,6)   10      6       4
    #   gcd(6,4)    6       4       2
    #   gcd(4,2)    4       2       0
    # 위의 경우 b의 값인 2가 최대공약수임
    r = None

    while r != 0:
        r = a % b
        a = b
        b = r

    return a


# 입력
t = int(input())

# 처리
for i in range(t):
    # 「*」연산자는 map 객체의 결과를 개별인자로 풀어내는 연산을 함
    # 따라서 아래와 같이 적으면 변수선언 없이 한방에 get_lcm함수로 인자 전달 가능
    # 단, 「*」연산후 인자의 개수가 get_lcm가 받아들이는 인자의 개수를 초과하면 에러가 발생할 가능성이 있으므로
    # 입력포멧이 유동적인 경우는 이용에 주의
    # 또한 간결하게 작성은 가능하지만,
    # 가독성면에서도 변수를 명시적으로 선언하여 전달하는 방법보다는 좋지 않으므로 유지보수 관점에서도 고려가 필요
    # 일단 아래의 코드는 백준 입력포맷에 맞춰서 둘중 큰 수를 get_lcm함수의 a, 작은 수를 b로 전달함
    get_lcm(*sorted(map(int, input().split()), reverse=True))
