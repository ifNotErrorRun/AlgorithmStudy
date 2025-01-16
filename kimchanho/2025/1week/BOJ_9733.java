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
    // 입력이 끝날 때까지 반복
    while ((input = br.readLine()) != null) {
      Arrays.stream(input.split(" "))
          .forEach(s -> map.put(s, map.getOrDefault(s, 0) + 1));
    }

    int total = map.values().stream().mapToInt(Integer::valueOf).sum();

    String[] turn = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
    for (String t : turn) {
      double percent = (double) map.getOrDefault(t, 0) / total;
      // 소수점 둘째 자리까지 출력
      System.out.println(t + " " + map.getOrDefault(t, 0) + " " + String.format("%.2f", percent));
    }
    System.out.println("Total " + total + " 1.00");
  }
}