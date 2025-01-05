import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11655 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    for (char c : br.readLine().toCharArray()) {
      int codePoint = c;
      if (c >= 'a' && c <= 'z') {
        codePoint = c + 13 > 'z' ? c + 12 - 'z' + 'a' : c + 13;
      } else if (c >= 'A' && c <= 'Z') {
        codePoint = c + 13 > 'Z' ? c + 12 - 'Z' + 'A' : c + 13;
      }
      String rot13 = Character.toString(codePoint);
      sb.append(rot13);
    }
    System.out.println(sb);
  }

}
