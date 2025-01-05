import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10539 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      int sum = Arrays.stream(a).limit(i).sum();
      a[i] = b[i] * (i + 1) - sum;
      sb.append(a[i]).append(" ");
    }

    System.out.println(sb);
  }
}
