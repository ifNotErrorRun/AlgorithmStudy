import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BOJ_2161 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Queue<Integer> queue = IntStream.rangeClosed(1, n)
        .boxed()
        .collect(Collectors.toCollection(LinkedList::new));
    StringBuilder sb = new StringBuilder();
    while (!queue.isEmpty()) {
      sb.append(queue.poll()).append(" ");
      if (!queue.isEmpty()) {
        queue.offer(queue.poll());
      }
    }
    System.out.println(sb);
  }
}
