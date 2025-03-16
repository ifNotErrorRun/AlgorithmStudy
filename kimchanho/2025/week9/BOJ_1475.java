import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1475 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] count = new int[10];
    br.readLine().chars().map(c -> c - '0').forEach(i -> count[i]++);
    count[6] = count[9] = (count[6] + count[9] + 1) / 2;
    Arrays.stream(count).max().ifPresent(System.out::println);
  }

}
