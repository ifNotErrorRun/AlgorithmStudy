import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2501 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
    int n = Integer.parseInt(tokenizer.nextToken());
    int m = Integer.parseInt(tokenizer.nextToken());

    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
      if (m == count) {
        System.out.println(i);
        break;
      }
    }
    if (count < m) {
      System.out.println(0);
    }
  }
}
