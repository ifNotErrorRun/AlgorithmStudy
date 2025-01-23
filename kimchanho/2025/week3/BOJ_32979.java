import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Queue;
import java.util.stream.Collectors;

public class BOJ_32979 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();  // person: ignore
    br.readLine(); // gameRound: ignore
    Queue<Integer> hands = Arrays.stream(br.readLine().split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toCollection(LinkedList::new));
    int[] roundTarget = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    StringBuilder sb = new StringBuilder();
    for (int target : roundTarget) {
      for (int i = 0; i < target - 1; i++) {
        hands.offer(hands.poll());
      }
      sb.append(hands.peek()).append(" ");
    }
    System.out.println(sb);
  }
}
