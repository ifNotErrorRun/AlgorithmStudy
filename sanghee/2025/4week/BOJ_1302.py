# 4주차 베스트셀러
# https://www.acmicpc.net/problem/1302

import sys
inp = sys.stdin.readline

N = int(inp().rstrip())
titles_dict = {}

for _ in range(N):
    title = inp().rstrip()

    if title not in titles_dict:
        titles_dict[title] = 1
    else:
        titles_dict[title] += 1

bestseller_list = []

bestseller_num = max(titles_dict.values())

for i in titles_dict:
    if titles_dict[i] == bestseller_num:
        bestseller_list.append(i)

bestseller_list.sort()
print(bestseller_list[0])