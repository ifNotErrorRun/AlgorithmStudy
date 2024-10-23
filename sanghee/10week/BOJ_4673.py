# python의 자료형: 집합(set)은 해시 테이블 기반으로 리스트보다 훨씬 빠름! 조건이 맞을 경우 사용할 것.
self_numbers = set(range(1, 10000))

#9974부터는 시행 1번으로도 10000을 넘으므로 연산 필요 없음
for i in range(1, 9973):
  num = i
  while num < 10000:
      num_divided = list(map(int, str(num)))
      num += sum(num_divided)
      if num in self_numbers:
         self_numbers.remove(num)
for i in self_numbers:
  print(i)


# 기억할 것 정리
# 1. 집합 자료형 set
# 2. 숫자 자릿수별로 나누기
# 3. 리스트에 없는 걸 빼려고 하면 오류가 나므로 if 처리를 해야 함