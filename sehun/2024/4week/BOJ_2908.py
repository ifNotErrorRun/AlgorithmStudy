def reverse_number(num: str):
    num_list = list(num)
    num_list.reverse()
    return int("".join(num_list))


A, B = input().split()

A = reverse_number(A)
B = reverse_number(B)

print(max(A, B))
