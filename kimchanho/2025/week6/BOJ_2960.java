import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2960 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int[] arr = new int[n + 1];
    Arrays.fill(arr, 2, arr.length, 1);
    int i = 1;
    while (i++ < arr.length - 1) {
      if (arr[i] == 0) {
        continue;
      }
      int j = i;
      while (j <= n) {
        if (arr[j] == 1) {
          arr[j] = 0;
          k--;
          if (k == 0) {
            System.out.println(j);
            return;
          }
        }
        j += i;
      }
    }
  }
}
