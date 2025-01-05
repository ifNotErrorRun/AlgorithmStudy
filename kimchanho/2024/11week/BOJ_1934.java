import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1934 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(reader.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(reader.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      sb.append(a * b / uclid(a, b)).append("\n");
    }
    System.out.println(sb);
  }

  public static int uclid(int a, int b) {
    if (b == 0) {
      return a;
    }
    return uclid(b, a % b);
  }
}
