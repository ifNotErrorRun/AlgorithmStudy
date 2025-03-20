import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_1388 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int y = Integer.parseInt(st.nextToken());
    int x = Integer.parseInt(st.nextToken());
    char[][] board = new char[y][x];
    for (int i = 0; i < y; i++) {
      board[i] = br.readLine().toCharArray();
    }

    int count = 0;
    Map<Integer, Set<Integer>> visited = new HashMap<>();

    Map<Character, List<int[]>> direction = new HashMap<>();
    direction.put('-', List.of(new int[] {0, 1}, new int[] {0, -1}));
    direction.put('|', List.of(new int[] {1, 0}, new int[] {-1, 0}));

    for (int i = 0; i < y; i++) {
      for (int j = 0; j < x; j++) {
        if (visited.containsKey(i) && visited.get(i).contains(j)) {
          continue;
        }
        count++;
        char boardDirection = board[i][j];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {i, j});
        while (!queue.isEmpty()) {
          int[] current = queue.poll();
          int currentY = current[0];
          int currentX = current[1];
          if (visited.containsKey(currentY) && visited.get(currentY).contains(currentX)) {
            continue;
          }
          for (int[] d : direction.get(boardDirection)) {
            int nextY = currentY + d[0];
            int nextX = currentX + d[1];
            if (nextY < 0 || nextY >= y || nextX < 0 || nextX >= x || board[nextY][nextX] != boardDirection) {
              continue;
            }
            queue.add(new int[] {nextY, nextX});
          }
          visited.putIfAbsent(currentY, new HashSet<>());
          visited.get(currentY).add(currentX);
        }
      }
    }

    System.out.println(count);
  }
}
