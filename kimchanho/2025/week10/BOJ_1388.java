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
    // 방문한 좌표를 저장하는 visited
    Map<Integer, Set<Integer>> visited = new HashMap<>();

    // 이동 방향을 저장하는 direction (key: 장식 형태, value: 이동 방향 [y좌표, x좌표])
    Map<Character, List<int[]>> direction = new HashMap<>();
    direction.put('-', List.of(new int[] {0, 1}, new int[] {0, -1}));
    direction.put('|', List.of(new int[] {1, 0}, new int[] {-1, 0}));

    // 모든 좌표를 한번씩 스캔
    for (int i = 0; i < y; i++) {
      for (int j = 0; j < x; j++) {
        // 이미 방문한 좌표라면 continue
        if (visited.containsKey(i) && visited.get(i).contains(j)) {
          continue;
        }
        // 방문하지 않은 좌표라면 처음 보는 장식이기 때문에
        // count를 증가시키고 해당 좌표를 시작으로 BFS 탐색
        count++;
        // 현재 좌표의 장식 형태
        char boardDirection = board[i][j];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {i, j});
        // BFS 탐색
        while (!queue.isEmpty()) {
          int[] current = queue.poll();
          int currentY = current[0];
          int currentX = current[1];
          for (int[] d : direction.get(boardDirection)) {
            int nextY = currentY + d[0];
            int nextX = currentX + d[1];

            // 맵을 벗어나거나
            // 이미 방문한 좌표이거나
            // 현재 좌표의 장식 형태와 다른 장식 형태라면 continue
            if (nextY < 0 || nextY >= y || nextX < 0 || nextX >= x
                || (visited.containsKey(nextY) && visited.get(nextY).contains(nextX))
                || board[nextY][nextX] != boardDirection) {
              continue;
            }
            queue.add(new int[] {nextY, nextX});
          }
          // 현재 위치를 방문한 좌표에 저장
          visited.putIfAbsent(currentY, new HashSet<>());
          visited.get(currentY).add(currentX);
        }
      }
    }

    System.out.println(count);
  }
}
