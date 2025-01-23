croatia_alphabet = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
N = input()

for i in croatia_alphabet:
    N = N.replace(i, "_")
print(len(N))
