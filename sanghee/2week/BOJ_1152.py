#1152

sentence = input()

def print_word_num(sentence):
  words = sentence.split(" ")
  while '' in words:
    words.remove('')

  # print(words)
  print(len(words))

print_word_num(sentence)