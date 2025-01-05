import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;

public class BOJ_1157 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String words = reader.readLine();

    Map<Character, Integer> map = new HashMap<>();

    for (char c : words.toUpperCase().toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    List<Entry<Character, Integer>> sortedList = map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toList());

    if (sortedList.size() == 1) {
      System.out.println(sortedList.get(0).getKey());
      return;
    }

    Map.Entry<Character, Integer> first = sortedList.get(0);
    Map.Entry<Character, Integer> second = sortedList.get(1);

    if (Objects.equals(first.getValue(), second.getValue())) {
      System.out.println("?");
    } else {
      System.out.println(first.getKey());
    }
  }
}
