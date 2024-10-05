def move_element_forword(index, result="", final_flag=False) -> str:
    # 커서 내릴때 출력(1)
    result += "1" * index

    # KBS2를 옮길때는 0번 인덱스가 아닌 1번인덱스까지만 옮기면 되므로 해당 처리를 하는 조건식
    if final_flag:
        index -= 1

    # 채널을 위로 옮길때 출력(4)
    result += "4" * index
    return result


N: int = int(input())
channel_list = []
for i in range(N):
    channel_list.append(input())

kbs1_index: int = channel_list.index("KBS1")
kbs2_index: int = channel_list.index("KBS2")

# kbs2를 먼저 가장위로 올리고 그다음 kbs1을 올림
if kbs1_index > kbs2_index:
    # KBS1가 KBS2보다 뒤에 위치해있을 경우 KBS1를 위로 올리는과정에서 KBS2와 위치가 바뀌어 버림
    # 따라서 KBS2는 한칸 더 옮겨줄 필요가 있음
    kbs2_index += 1
    result = move_element_forword(kbs1_index)
    print(move_element_forword(kbs2_index, result, final_flag=True))
else:
    result = move_element_forword(kbs1_index)
    print(move_element_forword(kbs2_index, result, final_flag=True))
