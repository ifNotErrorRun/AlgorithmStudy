import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * @title 카드 합체 놀이 (15903)
 * @description 카드 뭉치에서 가장 작은 두 카드를 뽑아 두 카드의 합을 구하고, 두 카드를 합친 뒤 다시 카드 뭉치에 넣는다.
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/15903
 */
public class BOJ_15903 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    st.nextToken(); // ignore
    int operationCount = Integer.parseInt(st.nextToken());

    // 카드 뭉치를 우선순위 큐로 구현 (작은 순서대로 정렬)
    PriorityQueue<Long> cards = Arrays.stream(br.readLine().split(" "))
        .map(Long::parseLong)
        .collect(Collectors.toCollection(PriorityQueue::new));

    // 카드 두 장을 뽑아 합친 뒤 다시 카드 뭉치에 넣는다.
    for (int i = 0; i < operationCount; i++) {
      long sum = cards.poll() + cards.poll();
      cards.add(sum);
      cards.add(sum);
    }

    // 카드 뭉치에 있는 카드들의 합을 구한다.
    long sum = cards.stream().mapToLong(Long::longValue).sum();
    System.out.println(sum);
  }
}
