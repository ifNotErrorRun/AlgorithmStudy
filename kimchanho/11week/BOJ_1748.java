import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1748 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());

    long result = 0;
    while (n > 0) {
      int length = String.valueOf(n).length();
      String m = "9".repeat(length - 1);
      long size = n - Long.parseLong(!m.isBlank() ? m : "0");
      result += size * length;
      n -= size;
    }
    System.out.println(result);
  }

}
