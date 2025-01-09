import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @title 회사에 있는 사람 (7785)
 * @description 회사에 남아 있는 사람 수를 세는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/7785
 */
public class BOJ_7785 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    Set<String> people = new HashSet<>();
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String name = st.nextToken();
      String action = st.nextToken();
      if (action.equals("enter")) {
        people.add(name);
      } else {
        people.remove(name);
      }
    }

    people.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);
  }
}
