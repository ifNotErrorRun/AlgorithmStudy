import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1264 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String line = reader.readLine();
      if (line.startsWith("#")) return;
      int count = 0;
      for (char c : line.toLowerCase().toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
