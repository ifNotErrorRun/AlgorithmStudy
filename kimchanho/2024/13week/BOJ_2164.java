import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BOJ_2164 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    Queue<Integer> queue = IntStream.rangeClosed(1, n).boxed()
        .collect(Collectors.toCollection(LinkedList::new));

    while (queue.size() > 1) {
      queue.poll();
      queue.offer(queue.poll());
    }
    System.out.println(queue.poll());
  }
}
