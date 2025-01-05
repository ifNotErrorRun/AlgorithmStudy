import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10809 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    int[] alphabet = new int[26];
    Arrays.fill(alphabet, -1);

    for (char c : s.toCharArray()) {
      int index = c - 'a';
      if (alphabet[index] == -1) {
        alphabet[index] = s.indexOf(c);
      }
    }
    String result = Arrays.stream(alphabet).mapToObj(String::valueOf)
        .reduce("", (acc, cur) -> acc + cur + " ");
    System.out.println(result.trim());
  }
}
