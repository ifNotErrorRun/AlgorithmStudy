import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1110 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int start = Integer.parseInt(br.readLine());
    int goal = start;
    int count = 0;
    do {
      int left = start / 10;
      int right = start % 10;
      int newRight = (left + right) % 10;
      start = Integer.parseInt("" + right + newRight);
      count++;
    } while (start != goal);
    System.out.println(count);
  }
}
