import sys
inp = lambda: sys.stdin.readline().rstrip()

S = inp()

prior = S[0]
h = [prior]
for i, s in enumerate(S):
    if prior == s:
        continue
    else:
        h.append(s)
        prior = s

print(min(h.count('0'), h.count('1')))