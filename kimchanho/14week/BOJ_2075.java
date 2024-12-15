import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class BOJ_2075 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

    for (int i = 0; i < n; i++) {
      Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::valueOf)
          .forEach(pq::offer);
    }
    for (int i = 1; i < n; i++) {
      pq.poll();
    }
    System.out.println(pq.poll());
  }

}
