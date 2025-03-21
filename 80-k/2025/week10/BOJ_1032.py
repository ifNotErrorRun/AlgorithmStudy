import sys
inp = lambda: sys.stdin.readline().rstrip()

N = int(inp())

files = []
for _ in range(N):
    files.append(inp())

SIZE = len(files[0])

result = ""
for i in range(SIZE):
    c = files[0][i]
    for j in range(1, N):
        if c != files[j][i]:
            c = '?'
            break
    result += c
print(result)