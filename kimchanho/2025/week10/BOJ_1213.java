import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_1213 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<Character, Integer> map = new HashMap<>();
    br.readLine().chars().forEach(c -> map.put((char) c, map.getOrDefault((char) c, 0) + 1));

    int oddCount = 0;
    for (int count : map.values()) {
      if (count % 2 == 1) {
        oddCount++;
      }
    }

    if (oddCount > 1) {
      System.out.println("I'm Sorry Hansoo");
      return;
    }

    StringBuilder palindrome = new StringBuilder();
    for (char c = 'Z'; c >= 'A'; c--) {
      if (!map.containsKey(c)) {
        continue;
      }

      int count = map.get(c);
      if (count % 2 == 1) {
        palindrome.insert(palindrome.length() / 2, c);
        count--;
      }

      for (int i = 0; i < count / 2; i++) {
        palindrome.insert(0, c);
        palindrome.append(c);
      }
    }

    System.out.println(palindrome);
  }
}
