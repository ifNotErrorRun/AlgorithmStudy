import sys
inp = sys.stdin.readline

N = int(inp().strip())
NN = inp().strip()

PRE_COM = ("L", "S")
FOLLOWING_COM = ("R", "K")

combo = {
    "R": "L",
    "K": "S"
}
pre_ctn = {
    "L": 0,
    "S": 0
}
ctn = 0

for item in NN:
    if item.isnumeric():
        ctn += 1
    elif item in PRE_COM:
        # pre-command
        pre_ctn[item] += 1
    elif item in FOLLOWING_COM and pre_ctn[combo[item]] > 0:
        ctn += 1
        pre_ctn[combo[item]] -= 1
    else:
        # following-command without pre-command
        break

print(ctn)