# feat: 한수 BOJ_1065.py

def IsHansu(number):
  each_num = list(map(int, str(number)))
  num_count = len(each_num)

  for n in range(num_count - 2):
    if each_num[n+2] - each_num[n+1] != each_num[n+1] - each_num[n]:
      return False

  return True

def CountHansu(number):
  count = 0

  if number <= 99:
    count = number

  else:
    count = 99

    for i in range(100, number + 1):
      if IsHansu(i):
        count += 1

  print(count)


N = int(input())
CountHansu(N)