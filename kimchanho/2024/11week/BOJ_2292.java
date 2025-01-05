import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int hex = 1, step = 1;
    while (hex < n) {
      hex += 6 * step;
      step++;
    }
    System.out.println(step);
  }
}
