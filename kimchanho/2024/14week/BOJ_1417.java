import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class BOJ_1417 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

    int me = 0;
    for (int i = 0; i < n; i++) {
      int votes = Integer.parseInt(br.readLine());
      if (i == 0) {
        me = votes;
        continue;
      }
      if (votes >= me) {
        pq.offer(votes);
      }
    }

    int sum = 0;
    while (!pq.isEmpty()) {
      int current = pq.poll();
      if (current < me) {
        continue;
      }
      current--;
      sum++;
      me++;
      pq.offer(current);
    }
    System.out.println(sum);

  }

}
