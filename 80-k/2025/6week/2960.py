import sys
inp = sys.stdin.readline

# prime number: numbers are bigger than 1, and can be divided by 1 and itself.
def t(n, k):
    ctn = 1
    # use index for a number and value for counts.
    erased = [-1] * (n+1) # already erased?

    for i in range(2, n + 1):
        if erased[i] != -1:
            continue
        erased[i] = ctn
        ctn += 1
        for j in range(2, (n //i) + 1):
            next_number = i * j
            if erased[next_number] != -1:
                continue
            else:
                erased[next_number] = ctn
                ctn += 1

    return erased.index(k)

N, K = map(int, inp().strip().split())   

print(t(N, K))