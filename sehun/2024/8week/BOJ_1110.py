N = int(input())

count = 0
initial_value = N

while True:
    sip = int(N / 10)
    ill = N % 10
    N = ill * 10 + (sip + ill) % 10
    count += 1

    if initial_value == N:
        break

print(count)
