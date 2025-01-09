import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

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
