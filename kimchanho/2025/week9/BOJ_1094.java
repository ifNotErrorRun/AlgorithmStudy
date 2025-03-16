import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1094 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long count = Integer.toBinaryString(Integer.parseInt(br.readLine()))
        .chars()
        .filter(c -> c == '1')
        .count();
    System.out.println(count);
  }
}
