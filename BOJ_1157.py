#딕셔너리를 한번에 만들어주는 counter 생성자 사용
from collections import Counter
word_original = input()

def get_answer(word_original):
  word = word_original.upper()
  count_dict = Counter(word)
  max_count = max(count_dict.values())
  max_letters_list = [char for char, count in count_dict.items() if count == max_count]

  if len(max_letters_list) == 1:
    print(max_letters_list[0])
  else:
    print("?")

get_answer(word_original)