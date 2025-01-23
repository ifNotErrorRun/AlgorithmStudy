import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @title 베스트셀러 (1302)
 * @description 가장 많이 팔린 책의 제목을 출력하는 문제, 여러 개일 경우 사전 순으로 가장 앞선 것을 출력
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/1302
 */
public class BOJ_1302 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Map<String, Integer> books = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String title = br.readLine();
      books.put(title, books.getOrDefault(title, 0) + 1);
    }
    books.entrySet().stream()
        .max(comparingByValueAndOrderingByDesc)
        .map(Map.Entry::getKey)
        .ifPresent(System.out::println);
  }

  public static Comparator<Map.Entry<String, Integer>> comparingByValueAndOrderingByDesc =
      (e1, e2) -> e1.getValue().equals(e2.getValue())
          ? e2.getKey().compareTo(e1.getKey())
          : e1.getValue() - e2.getValue();
}
