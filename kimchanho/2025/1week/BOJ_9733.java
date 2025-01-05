import java.util.*;
import java.io.*;

/**
 * @title 꿀벌 (9733)
 * @description 단어의 출현 빈도를 계산하여 출력하는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/9733
 */
public class BOJ_9733 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<String, Integer> map = new HashMap<>();

    String input;
    while ((input = br.readLine()) != null) {
      String[] arr = input.split(" ");
      for (String s : arr) {
        map.put(s, map.getOrDefault(s, 0) + 1);
      }
    }

    int total = map.values().stream().mapToInt(Integer::valueOf).sum();

    String[] turn = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
    for (String t : turn) {
      if (map.containsKey(t)) {
        double percent = (double) map.get(t) / total;
        System.out.println(t + " " + map.get(t) + " " + String.format("%.2f", percent));
      } else {
        System.out.println(t + " 0 0.00");
      }
    }
    System.out.println("Total " + total + " 1.00");
  }
}
