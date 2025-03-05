import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_31575 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int y = Integer.parseInt(st.nextToken());
    int x = Integer.parseInt(st.nextToken());
    int[][] map = new int[x][y];

    for (int i = 0; i < x; i++) {
      map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[] {0, 0});
    int[][] directions = new int[][] {{1, 0}, {0, 1}};

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      if (current[0] == x - 1 && current[1] == y - 1) {
        System.out.println("Yes");
        return;
      }

      for (int[] direction : directions) {
        int nextX = current[0] + direction[0];
        int nextY = current[1] + direction[1];
        if (nextX >= x || nextY >= y || map[nextX][nextY] == 0) {
          continue;
        }
        map[nextX][nextY] = 0;
        queue.add(new int[] {nextX, nextY});
      }
    }
    System.out.println("No");

  }
}
