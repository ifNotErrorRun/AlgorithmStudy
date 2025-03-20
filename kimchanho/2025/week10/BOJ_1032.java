import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class BOJ_1032 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    char[] first = br.readLine().toCharArray();
    for (int i = 1; i < count; i++) {
      char[] second = br.readLine().toCharArray();
      for (int j = 0; j < first.length; j++) {
        if (first[j] != second[j]) {
          first[j] = '?';
        }
      }
    }

    System.out.println(first);
  }
}
