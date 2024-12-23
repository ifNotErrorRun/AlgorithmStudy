# https://www.acmicpc.net/problem/9012
# feat: 괄호 BOJ_9012.py

# 성립조건 1. 괄호는 (로 시작해 )로 끝날 것
# 성립조건 2. "("를 1, ")"를 -1로 뒀을 때 합이 0이 될 것
# 성립조건 3. count의 값이 1 이상이 되지 않을 것

def is_vps(parentheses):
  list_parentheses = list(parentheses)
  vps_count = 0

# peek()은 가장 상단에 있는 데이터를 삭제하지 않고 확인만 하고 싶을 때 사용하는 메서드

  # 처음이 (가 아니거나 마지막이 )이 아닌 경우는 거짓을 반환
  if list_parentheses[-1] == "(" or list_parentheses[0] == ")":
    return False


  # )보다 (가 많아지는 순간 VPS가 아님
  else:
    for _ in range(len(list_parentheses)):
      if list_parentheses.pop() == "(":
        vps_count += 1
        if vps_count > 0:
            return False
      else:
        vps_count -= 1

    if vps_count == 0:
      return True

    else:
      return False


T = int(input())

for _ in range(T):
  this_parentheses = input()

  if is_vps(this_parentheses):
    print("YES")

  else:
    print("NO")