import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10039 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int sum = 0;
    for (int i = 0; i < 5; i++) {
      sum += Integer.max(Integer.parseInt(br.readLine()), 40);
    }
    System.out.println(sum / 5);
  }
}