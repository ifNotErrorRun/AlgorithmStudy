def pop_and_push(input_string: str) -> str:
    # 파이썬에서 스택 모듈?은 없지만 리스트의 append(push)와 pop메소드를 이용가능... 성능은 조사해봐야함
    input_array = input_string.split()
    stack = []
    result = ""
    for word in input_array:
        stack.append(word)

    for i in range(len(stack)):
        if i == 0:
            pass
        else:
            result += " "
        result += stack.pop()
    return result


n = int(input())

for i in range(1, n + 1):
    print(f"Case #{i}: {pop_and_push(input())}")
