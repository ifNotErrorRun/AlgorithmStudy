import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_26169 {

  static int[] dx = {0, 0, 1, -1};
  static int[] dy = {-1, 1, 0, 0};

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[][] map = new int[5][5];
    for (int i = 0; i < 5; i++) {
      map[i] = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt)
          .toArray();
    }

    StringTokenizer st = new StringTokenizer(br.readLine());
    int startX = Integer.parseInt(st.nextToken());
    int startY = Integer.parseInt(st.nextToken());

    List<int[]> visited = new ArrayList<>();
    visited.add(new int[]{startX, startY});

    boolean result = dfs(map, startX, startY, visited);
    System.out.println(result ? 1 : 0);
  }

  static boolean dfs(int[][] map, int x, int y, List<int[]> visited) {
    if (visited.stream().filter(v -> map[v[0]][v[1]] == 1).count() >= 2) {
      return true;
    }
    if (visited.size() == 4) {
      return false;
    }
    for (int i = 0; i < 4; i++) {
      int nextX = x + dx[i];
      int nextY = y + dy[i];
      if (nextX < 0
          || nextX >= 5
          || nextY < 0
          || nextY >= 5
          || map[nextX][nextY] == -1
          || visited.stream().anyMatch(v -> v[0] == nextX && v[1] == nextY)) {
        continue;
      }
      visited.add(new int[]{nextX, nextY});
      if (dfs(map, nextX, nextY, visited)) {
        return true;
      }
      visited.remove(visited.size() - 1);
    }
    return false;
  }
}
