import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

public class BOJ_2941 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<Character, List<String>> croatiaMap = Map.of(
        'c', List.of("c=", "c-"),
        'd', List.of("dz=", "d-"),
        'l', List.of("lj"),
        'n', List.of("nj"),
        's', List.of("s="),
        'z', List.of("z=")
    );

    int count = 0;
    int p = 0;
    String input = br.readLine();
    if (input.length() == 1) {
      System.out.println(1);
      return;
    }

    while (p < input.length()) {
      char target = input.charAt(p);
      if (!croatiaMap.containsKey(target)) {
        p++;
        count++;
        continue;
      }
      List<String> croatia = croatiaMap.get(target);
      if (p + 2 <= input.length() && croatia.contains(input.substring(p, p + 2))) {
        p += 2;
        count++;
      } else if (p + 3 <= input.length() && croatia.contains(input.substring(p, p + 3))) {
        p += 3;
        count++;
      } else {
        p++;
        count++;
      }
    }
    System.out.println(count);
  }
}
