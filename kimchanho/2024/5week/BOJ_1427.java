import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1427 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] numbers = br.readLine().toCharArray();
    Arrays.sort(numbers);
    System.out.println(new StringBuilder(new String(numbers)).reverse());
  }
}