import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BOJ_16173 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] map = new int[n][n];
    for (int i = 0; i < n; i++) {
      map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
    Map<Integer, Set<Integer>> visited = new HashMap<>();
    visited.put(0, new HashSet<>());
    visited.get(0).add(0); // 시작점은 방문했다고 표시
    Deque<int[]> waiting = new ArrayDeque<>();
    waiting.push(new int[]{0, 0});

    int[] dx = {0, 1};
    int[] dy = {1, 0};

    while (!waiting.isEmpty()) {
      int[] curPoint = waiting.pop();
      int curStep = map[curPoint[0]][curPoint[1]];
      for (int i = 0; i < 2; i++) {
        int nextX = curPoint[0] + dx[i] * curStep;
        int nextY = curPoint[1] + dy[i] * curStep;

        if (nextX > n - 1 || nextY > n - 1 || visited.getOrDefault(nextX, new HashSet<>()).contains(nextY)) {
          continue;
        }
        if (map[nextX][nextY] == -1) {
          System.out.println("HaruHaru");
          return;
        }
        visited.putIfAbsent(nextX, new HashSet<>());
        visited.get(nextX).add(nextY);
        waiting.push(new int[]{nextX, nextY});
      }
    }
    System.out.println("Hing");
  }
}
