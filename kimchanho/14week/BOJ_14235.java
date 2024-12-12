import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_14235 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int cur = Integer.parseInt(st.nextToken());
      if (cur == 0) {
        if (queue.isEmpty()) {
          sb.append(-1);
        } else {
          sb.append(queue.poll());
        }
        sb.append("\n");
      } else {
        while (st.hasMoreTokens()) {
          queue.offer(Integer.parseInt(st.nextToken()));
        }
      }
    }
    System.out.println(sb);
  }

}
