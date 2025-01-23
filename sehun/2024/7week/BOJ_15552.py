import sys

N = int(input())

for _ in range(N):
    input = sys.stdin.readline()
    a, b = map(int, input.split())
    print(a + b)
