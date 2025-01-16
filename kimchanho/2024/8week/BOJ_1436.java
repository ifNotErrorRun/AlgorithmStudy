import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.IntStream;

public class BOJ_1436 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int r = IntStream.iterate(666, i -> i + 1)
        .filter(i -> String.valueOf(i).contains("666"))
        .limit(n)
        .max()
        .orElseThrow();
    bw.write(String.valueOf(r));
    bw.flush();
  }
}