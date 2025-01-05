import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.IntStream;

public class BOJ_10872 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    if (n == 0) {
      writer.write("1");
    } else {
      int factorial = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
      writer.write(String.valueOf(factorial));
    }
    writer.flush();
  }
}