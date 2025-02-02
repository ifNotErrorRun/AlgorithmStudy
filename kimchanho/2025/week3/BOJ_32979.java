import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @title 아파트 (32979)
 * @description 손이 겹쳐진 상태에서 손을 빼는 순서에 따라서 당첨된 사람 번호를 출력하는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/32979
 */
public class BOJ_32979 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();  // person   : ignore
    br.readLine();  // gameRound: ignore
    String[] hands = br.readLine().split(" ");
    int[] roundTarget = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    int index = 0;
    StringBuilder sb = new StringBuilder();
    // 각 라운드별로 손을 빼는 순서에 따라서 당첨된 사람 번호를 출력
    for (int target : roundTarget) {
      index = (index + target - 1) % hands.length;
      sb.append(hands[index]).append(" ");
    }
    System.out.println(sb);
  }
}
