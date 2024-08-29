import sys

a = int(sys.stdin.readline())


def factorial(n: int) -> int:
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)


def build_bridge(n: int, m: int) -> None:
    '''
        1. 동쪽의 m개의 포인트중에서 서쪽의 n개의 포인트의 다리의 개수...
        2. 순서를 고려하지 않은 경우의 수?? 
        2. https://blog.naver.com/2gumin14/220641891907이쪽을 참고하여 nCm을 실장
    '''
    result = int(factorial(n)/(factorial(n-m) * factorial(m)))
    print(result)


for i in range(0, a):
    m, n = map(int, sys.stdin.readline().split())
    build_bridge(n, m)
