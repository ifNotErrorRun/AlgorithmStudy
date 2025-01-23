# 입력
N = int(input())
A, B = list(map(int, input().split())), list(map(int, input().split()))
S = 0

# 전처리
A.sort()
B.sort(reverse=True)

# 처리
for i in range(N):
    S += A[i] * B[i]

# 출력
print(S)
