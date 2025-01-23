import sys

N = int(sys.stdin.readline().rstrip())
is_present = set()

for _ in range(N):
    name, status = sys.stdin.readline().rstrip().split()

    if status == "enter":
        is_present.add(name)
    else:
        is_present.remove(name)

answer = list(is_present)
answer.sort(reverse = True)

for name in range(len(answer)):
    print(answer[name])