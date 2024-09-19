import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2609 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .sorted()
        .toArray();

    int mcd = mcd(arr[0], arr[1]);
    int lcm = lcm(arr[0], arr[1], mcd);
    System.out.println(mcd);
    System.out.println(lcm);
  }

  public static int mcd(int a, int b) {
    return b == 0 ? a : mcd(b, a % b);
  }

  public static int lcm(int a, int b, int mcd) {
    return a * b / mcd;
  }
}