import sys
inp = lambda:sys.stdin.readline().rstrip()

N = inp()
digits = [1 for _ in range(10)]
replacement = {6:9, 9:6}
ctn = 1

for n in N:
    n = int(n)
    if digits[n] > 0:
        digits[n] -= 1
    elif n == 9 and digits[replacement[n]] > 0:
        digits[replacement[n]] -= 1
    elif n == 6 and digits[replacement[n]] > 0:
        digits[replacement[n]] -= 1
    elif digits[n] == 0:
        ctn += 1
        for i in range(10):
            digits[i] += 1
        digits[n] -= 1

print(ctn)