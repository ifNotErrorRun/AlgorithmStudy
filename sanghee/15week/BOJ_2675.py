import sys

# 문자열 반복하는 함수 생성
def repeat_string(frequency, original_string):
  frequency = int(frequency) # 함수 내부에서 다 처리해주는게 좋지 않을까 싶어서 자료형도 여기서 변환
  letters_list = list(original_string)
  last_letter_num = len(letters_list) - 1

  for i in range(last_letter_num):
     print(letters_list[i] * frequency, end = "")

  print(letters_list[last_letter_num] * frequency)

# 실제 실행
T = int(sys.stdin.readline())

for _ in range(T):
    R, S = sys.stdin.readline().split()
    repeat_string(R, S)