import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1193 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    boolean direction = false;
    int sum = 0;
    int size = 0;
    int step = 0;
    for (int i = 1; sum < n; i++) {
      size = sum;
      sum += i;
      step = i + 1;
      direction = !direction;
    }
    int a = n - size;
    int b = step - a;
    StringBuilder sb = new StringBuilder();
    if (direction) {
      sb.append(b).append("/").append(a);
    } else {
      sb.append(a).append("/").append(b);
    }
    System.out.println(sb);
  }
}
