#2441

count = int(input())

def print_stars(count):
  for i in range(count):
    blank_count = count
    while count != 0:
      print(" " * (blank_count - count) + "*" * count )
      count -= 1

print_stars(count)