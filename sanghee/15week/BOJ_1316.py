# feat: 그룹 단어 체커 BOJ_1316.py
N = int(input())
count = 0

def IsGroup(char_list, word_length):
  char_included = set()

  if word_length == 0:
    return True

  for i in range(word_length):
    i_word = char_list[i]
    i_plus_one = char_list[i + 1]

    if i_word != i_plus_one and i_plus_one in char_included:
      return False
      break

    elif i == word_length - 1:
      return True

    else:
      char_included.add(i_word)


for _ in range(N):
  word = input()
  char_this = list(word)
  length_this = len(char_this) - 1

  if IsGroup(char_this, length_this):
    count += 1

print(count)

# must write the FULL FUNCTION(with parameters) in conditions
# when you want to decide it's passed or not, you can use True / False flags