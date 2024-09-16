import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_2577 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    String result = String.valueOf(a * b * c);
    Map<Character, Integer> map = new HashMap<>();
    for (char num : result.toCharArray()) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      sb.append(map.getOrDefault(Character.forDigit(i, 10), 0)).append("\n");
    }
    System.out.println(sb);
  }
}