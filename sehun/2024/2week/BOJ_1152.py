import sys

input = sys.stdin.readline().lstrip().rstrip()
if input == "":
    print(0)
    exit(0)

list = input.split(" ")

print(len(list))
