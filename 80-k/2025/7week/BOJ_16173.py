from collections import deque
import sys
inp = sys.stdin.readline

MOVES = [
    (0, 1), # Right
    (1, 0)  # Down
]
START = (0, 0)

N = int(inp().strip())
world_map = []
for _ in range(N):
    row = list(map(int, inp().strip().split()))
    world_map.append(row)

def BFS(y, x):
    visited = [ [False] * (N) for _ in range(N)]
    visited[y][x] = True

    q = deque([(y, x)])
    while q:
        cy, cx = q.popleft()
        for dy, dx in MOVES:
            weight = world_map[cy][cx]
            if weight == -1:
                return 'HaruHaru'

            ny, nx = cy + (dy * weight), cx + (dx * weight)
            if ny < 0 or ny >= N or nx < 0 or nx >= N:
                continue
            if visited[ny][nx] is False:
                visited[ny][nx] = True
                q.append((ny, nx))
    return 'Hing'

print(BFS(START[0], START[1]))