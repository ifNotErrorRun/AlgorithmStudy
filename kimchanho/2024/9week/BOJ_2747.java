import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_2747 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Map<Integer, Integer> calculated = new HashMap<>();
    calculated.put(0, 0);
    calculated.put(1, 1);
    System.out.println(fibonacci(calculated, n));
  }

  public static int fibonacci(Map<Integer, Integer> calculated, int n) {
    if (calculated.containsKey(n)) {
      return calculated.get(n);
    }
    int result = fibonacci(calculated, n - 1) + fibonacci(calculated, n - 2);
    calculated.put(n, result);
    return result;
  }
}
