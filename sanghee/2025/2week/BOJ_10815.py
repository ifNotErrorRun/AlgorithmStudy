import sys

N = int(sys.stdin.readline().rstrip())
sg_cards = { int(num) for num in sys.stdin.readline().split() }

M = int(sys.stdin.readline().rstrip())
guess_cards_list = [int(num) for num in sys.stdin.readline().split()]
guess_cards = set(guess_cards_list)

cards_intersection = sg_cards & guess_cards
cards_difference = guess_cards - sg_cards

answer = []

for card in guess_cards_list:
    if card in cards_intersection:
        answer.append(1)
    else:
        answer.append(0)

for num in answer:
    print(num, end = ' ')