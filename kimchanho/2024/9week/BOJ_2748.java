import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_2748 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Map<Integer, Long> calculated = new HashMap<>();
    calculated.put(0, 0L);
    calculated.put(1, 1L);
    System.out.println(fibonacci(calculated, n));
  }

  public static long fibonacci(Map<Integer, Long> calculated, int n) {
    if (calculated.containsKey(n)) {
      return calculated.get(n);
    }
    long result = fibonacci(calculated, n - 1) + fibonacci(calculated, n - 2);
    calculated.put(n, result);
    return result;
  }
}