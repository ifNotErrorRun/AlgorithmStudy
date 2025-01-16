import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1476 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = 1;
    int[] s = new int[]{1, 1, 1};
    int[] g = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
    while (s[0] != g[0] || s[1] != g[1] || s[2] != g[2]) {
      s[0]++;
      s[1]++;
      s[2]++;
      s[0] = s[0] == 16 ? 1 : s[0];
      s[1] = s[1] == 29 ? 1 : s[1];
      s[2] = s[2] == 20 ? 1 : s[2];
      count++;
    }
    System.out.println(count);
  }
}