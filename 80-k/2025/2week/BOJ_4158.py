import sys
inp = sys.stdin.readline

N = int(inp().strip())
NN = set(map(int, inp().strip().split()))

M = int(inp().strip())
MM = map(int, inp().strip().split())

result = []

for m in MM:
    before = len(NN)
    NN.add(m)
    after = len(NN)
    if before == after:
        result.append('1')
    else:
        result.append('0')

print(' '.join(result))