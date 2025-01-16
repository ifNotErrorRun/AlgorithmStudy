import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class BOJ_10808 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = reader.readLine();
    Map<Character, Integer> alphabetCount = new HashMap<>();
    for (char c : input.toCharArray()) {
      alphabetCount.put(c, alphabetCount.getOrDefault(c, 0) + 1);
    }

    for (char c = 'a'; c <= 'z'; c++) {
      writer.write(alphabetCount.getOrDefault(c, 0) + " ");
    }
    writer.flush();
  }
}
