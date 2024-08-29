# 문자열을 입력받습니다.
text = input("문자열을 입력하세요: ")

# 문자열의 앞뒤 공백을 제거합니다.
trimmed_text = text.strip()

# 앞뒤 공백을 제거한 문자열에서 공백의 개수를 계산합니다.
space_count = trimmed_text.count(' ')

# 공백의 개수 플러스 1을 출력합니다.
result = space_count + 1
print(result)\