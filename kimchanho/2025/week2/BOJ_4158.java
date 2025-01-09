import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @title CD (4185)
 * @description 둘 다 가지고 있는 CD개수 세기 / 0 0 이 읿력될때까지 계속 반복
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/4185
 */
public class BOJ_4158 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      if (n == 0 && m == 0) {
        return;
      }

      Set<Integer> cd = new HashSet<>();
      for (int i = 0; i < n; i++) {
        cd.add(Integer.parseInt(br.readLine()));
      }

      int count = 0;
      for (int i = 0; i < m; i++) {
        if (cd.contains(Integer.parseInt(br.readLine()))) {
          count++;
        }
      }
      System.out.println(count);
    }
  }

}
