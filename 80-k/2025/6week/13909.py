import sys

# Windows are toggled (opened/closed) based on their divisor count
# Only perfect squares will have an odd number of divisors,
# resulting in an open window at the end
def count_open_windows(n):
    return int(n ** 0.5)

if __name__ == "__main__":
    N = int(sys.stdin.readline())
    print(count_open_windows(N))