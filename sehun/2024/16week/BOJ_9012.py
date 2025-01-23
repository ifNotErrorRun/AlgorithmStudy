def check_ps(input: str) -> None:
    stack = []

    for char in input:
        # 입력이 여는 괄호일 때는 push만 실행됨
        if char == "(":
            stack.append(char)
        # 입력이 닫는 괄호일 때는 pop만 실행되어야 함
        else:
            # stack이 비어있는 경우에 pop이 실행되면 예외가 발생됨
            # 해당케이스 : 「())」의 마지막 「)」
            if stack:
                stack.pop()
            # 스택이 비어있는 경우에 「)」 입력이 오는경우는 ps가 될 수 없음
            else:
                # NO의 경우에 그냥 return해버려서 함수를 종료시키는게 좋은 해결방안인지는 모르겠음
                return print("NO")

    # 최종적으로 stack이 비어있으면 모든 괄호가 짝이 맞은 경우임
    if stack:
        print("NO")
    else:
        print("YES")


t = int(input())

for i in range(t):
    check_ps(input())
