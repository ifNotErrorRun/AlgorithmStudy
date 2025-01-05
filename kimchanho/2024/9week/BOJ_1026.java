import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_1026 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] a = Arrays.stream(br.readLine().split(" "))
        .map(Integer::parseInt)
        .sorted(Comparator.reverseOrder())
        .toArray(Integer[]::new);
    Integer[] b = Arrays.stream(br.readLine().split(" "))
        .map(Integer::parseInt)
        .sorted()
        .toArray(Integer[]::new);
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += a[i] * b[i];
    }
    System.out.println(sum);
  }
}