def factorial(input: int):
    if input == 0 or input == 1:
        return 1
    else:
        return input * factorial(input - 1)


N: int = int(input())

print(factorial(N))
