import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @title 임스와 함께하는 미니게임 (25757)
 * @description 미니게임을 할 수 있는 횟수를 구하는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/25757
 */
public class BOJ_25757 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    Map<String, Integer> map = Map.of("Y", 1, "F", 2, "O", 3);
    int N = Integer.parseInt(st.nextToken());
    String game = st.nextToken();
    Set<String> set = new HashSet<>();

    // 셋을 사용해서 중복을 제거
    for (int i = 0; i < N; i++) {
      set.add(br.readLine());
    }

    // 중복되지 않은 수를 게임인원수로 나누어 출력
    System.out.println(set.size() / map.get(game));
  }
}
