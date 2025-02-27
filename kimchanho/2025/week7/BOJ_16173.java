import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @title 점프왕 쩰리 (16173)
 * @description 쩰리는 N x N 크기의 게임판 위에 서 있다. 쩰리는 가장 왼쪽 위 칸에서 시작해서 가장 오른쪽 아래 칸으로 가야 한다.
 *              쩰리는 한 번에 오른쪽이나 아래 칸으로 이동할 수 있다. 게임판에는 몇몇 칸에는 숫자가 쓰여 있다.
 *              이 숫자는 쩰리가 해당 칸에 도착했을 때, 그 칸에 적혀있는 숫자만큼 오른쪽이나 아래로 이동하면 된다는 것을 의미한다.
 *              가장 오른쪽 아래 칸에 도착할 수 있으면 "HaruHaru"를, 아니면 "Hing"을 출력한다.
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/16173
 */
public class BOJ_16173 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] map = new int[n][n];
    for (int i = 0; i < n; i++) {
      map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
    // 시작점은 방문했다고 표시
    Map<Integer, Set<Integer>> visited = new HashMap<>();
    visited.put(0, new HashSet<>());
    visited.get(0).add(0);

    Deque<int[]> waiting = new ArrayDeque<>();
    waiting.push(new int[]{0, 0});

    // 이동 방향은 오른쪽 또는 아래쪽으로만 가능
    int[] dx = {0, 1};
    int[] dy = {1, 0};

    while (!waiting.isEmpty()) {
      int[] curPoint = waiting.pop();
      int curStep = map[curPoint[0]][curPoint[1]];
      for (int i = 0; i < 2; i++) {
        // 현 위치의 숫자에 적힌 수 많큼 이동 (오른쪽, 아래쪽)
        int nextX = curPoint[0] + dx[i] * curStep;
        int nextY = curPoint[1] + dy[i] * curStep;

        // 벗어나거나 이미 방문한 곳이면 무시
        if (nextX > n - 1 || nextY > n - 1 || visited.getOrDefault(nextX, new HashSet<>()).contains(nextY)) {
          continue;
        }

        // 도착 가능하면 "HaruHaru" 출력 후 종료
        if (map[nextX][nextY] == -1) {
          System.out.println("HaruHaru");
          return;
        }
        visited.putIfAbsent(nextX, new HashSet<>());
        visited.get(nextX).add(nextY);
        waiting.push(new int[]{nextX, nextY});
      }
    }

    // 도착할 수 없으면 "Hing" 출력
    System.out.println("Hing");
  }
}
