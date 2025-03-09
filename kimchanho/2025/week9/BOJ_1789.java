import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1789 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long goal = Long.parseLong(br.readLine());

    long sum = 0;
    for (long i = 1; sum <= goal; i++) {
      if (sum + i > goal) {
        System.out.println(i - 1);
        break;
      }
      sum += i;
    }

  }
}
