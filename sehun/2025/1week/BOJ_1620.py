import sys

n, m = map(int, sys.stdin.readline().split())
pokemons = {}
index = {}

# 포켓몬을 인덱스: 이름, 이름: 인덱스로 저장하면 된다고 해서 했음...
for i in range(1, n + 1):
    line = sys.stdin.readline().strip()
    pokemons[line] = i
    index[i] = line

for _ in range(m):
    line = sys.stdin.readline().strip()
    if line.isalpha():
        print(pokemons[line])
    # ↓이거 key를 검색할 때 에러가 나서 보니 int로 형변환을 안해서 그런거였음....
    else:
        print(index[line])
