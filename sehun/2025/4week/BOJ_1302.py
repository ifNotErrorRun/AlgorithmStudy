import sys


n = int(sys.stdin.readline())
sold_books = {}

for _ in range(n):
    sold_book = sys.stdin.readline().rstrip()
    if sold_book in sold_books.keys():
        sold_books[sold_book] += 1
    else:
        sold_books[sold_book] = 1

# 책의 개수 최대치
max_value = max(sold_books.values())

max_item = [k for k, v in sold_books.items() if v == max_value]
print(sorted(max_item)[0])
