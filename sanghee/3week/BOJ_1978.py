# https://www.acmicpc.net/problem/1978
# feat: 소수 찾기 BOJ_1978.py

# 문제
# 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

# 입력
# 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

# 출력
# 주어진 수들 중 소수의 개수를 출력한다.


N = int(input())
nums = list(map(int, input().split()))
count = 0

for i in nums:
  if i == 1:
    continue
  if i == 2:
    count += 1
  else:
    origin = i
    is_prime = True

    for j in range(2, int(origin ** 0.5) + 1):
      if origin % j == 0:
        is_prime = False
        break
    if is_prime:
      count += 1

print(count)