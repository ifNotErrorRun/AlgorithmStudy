import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BOJ_1021 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int dequeSize = Integer.parseInt(st.nextToken());
    LinkedList<Integer> deque = IntStream.rangeClosed(1, dequeSize).boxed()
        .collect(Collectors.toCollection(LinkedList::new));

    int count = 0;
    int[] targets = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    for (int target : targets) {
      int targetIndex = deque.indexOf(target);
      int half = deque.size() / 2;
      if (targetIndex <= half) {
        while (deque.peekFirst() != target) {
          deque.addLast(deque.pollFirst());
          count++;
        }
      } else {
        while (deque.peekFirst() != target) {
          deque.addFirst(deque.pollLast());
          count++;
        }
      }
      deque.pollFirst();
    }
    System.out.println(count);
  }
}
