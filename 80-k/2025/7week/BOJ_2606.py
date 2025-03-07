# bidirectional graph
from collections import deque
import sys
inp = sys.stdin.readline

START_NODE = 1
N = int(inp().strip())
M = int(inp().strip())

network = [[] for _ in range(N + 1)]
visited = [False] * (N + 1)
for _ in range(M):
    a, b = map(int, inp().strip().split())
    network[a].append(b)
    network[b].append(a)

# def DFS(node):
#     ctn = 0
#     visited[node] = True

#     for computer in network[node]:
#         if visited[computer] is False:
#             ctn += 1
#             ctn += DFS(computer)
#     return ctn

def BFS(node):
    visited = [False] * (N + 1)
    ctn = 0
    visited[node] = True
    q = deque([node])

    while q:
        curr = q.popleft()

        for computer in network[curr]:
            if visited[computer] is False:
                visited[computer] = True
                ctn += 1
                q.append(computer)

    return ctn

#print(DFS(START_NODE))
print(BFS(START_NODE))