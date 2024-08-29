import sys


def spell_checker(input: str) -> bool:
    vowel = 'aeiou'
    return input in vowel


while True:
    input_line: str = sys.stdin.readline().rstrip()
    if input_line == '#':
        break
    else:
        count: int = 0
        for char in input_line.lower():
            if spell_checker(char):
                count += 1
        print(count)
