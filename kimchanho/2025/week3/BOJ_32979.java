import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * @title 아파트 (32979)
 * @description 손이 겹쳐진 상태에서 손을 빼는 순서에 따라서 당첨된 사람 번호를 출력하는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/32979
 */
public class BOJ_32979 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();  // person: 사용하지 않는 값 무시
    br.readLine(); // gameRound: 사용하지 않는 값 무시
    Queue<Integer> hands = Arrays.stream(br.readLine().split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toCollection(LinkedList::new));
    int[] roundTarget = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    StringBuilder sb = new StringBuilder();
    // 각 라운드별로 손을 빼는 순서에 따라서 당첨된 사람 번호를 출력
    for (int target : roundTarget) {
      for (int i = 0; i < target - 1; i++) {
        // 손을 빼고 바로 큐에 넣기
        hands.offer(hands.poll());
      }
      // 현재 가장 아래에 있는 손의 번호를 저장, 손을 빼지 않고 다음게임 진행
      sb.append(hands.peek()).append(" ");
    }
    System.out.println(sb);
  }
}
