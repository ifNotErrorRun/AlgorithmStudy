import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25418 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int count = 0;
    while (K / 2 >= A) {
      if (K % 2 == 1) {
        K--;
        count++;
      }
      K /= 2;
      count++;
    }
    while (K > A) {
      K--;
      count++;
    }
    System.out.println(count);
  }
}
