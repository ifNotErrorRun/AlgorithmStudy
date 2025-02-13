import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @title 회전하는 큐 (1021)
 * @description 큐에서 원하는 수를 뽑아내는데 필요한 최소 연산 횟수 구하기
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/1021
 */
public class BOJ_1021 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int dequeSize = Integer.parseInt(st.nextToken());

    // 덱 연산와 리스트 연산을 동시에 하기 위해 LinkedList 사용
    LinkedList<Integer> deque = IntStream.rangeClosed(1, dequeSize).boxed()
        .collect(Collectors.toCollection(LinkedList::new));

    int count = 0;
    int[] targets = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    for (int target : targets) {
      // 찾으려는 수의 인덱스 (현재 위치) 찾기
      int targetIndex = deque.indexOf(target);
      // 현재 중간 지점 인덱스 찾기
      int half = deque.size() / 2;

      // 중간 지점보다 작으면 왼쪽으로 이동, 크면 오른쪽으로 이동
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
      // 찾은 수를 빼내기
      deque.pollFirst();
    }
    System.out.println(count);
  }
}
