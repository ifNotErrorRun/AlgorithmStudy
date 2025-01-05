import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_1978 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String ignored = br.readLine();
    long primeCount = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
        .filter(BOJ_1978::isPrime)
        .count();

    bw.write(String.valueOf(primeCount));
    bw.flush();
  }

  public static boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}