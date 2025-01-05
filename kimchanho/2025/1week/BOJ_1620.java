import java.util.*;
import java.io.*;

/**
* @title 나는야 포켓몬 마스터 이다솜 (1620)
* @description 포켓몬 이름과 번호를 입력받아 번호로 이름을 찾거나 이름으로 번호를 찾는 문제
* @author Chanho Kim
* @see https://www.acmicpc.net/problem/1620
*/
public class BOJ_1620 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    Map<Integer, String> pokemonIndexMap = new HashMap<>();
    Map<String, Integer> pokemonNameMap = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      String name = br.readLine();
      // 인덱스, 이름별로 맵에 저장
      pokemonIndexMap.put(i, name);
      pokemonNameMap.put(name, i);
    }
    for (int i = 0; i < m; i++) {
      String input = br.readLine();
      // 입력값이 숫자면 인덱스로 이름을 찾고, 문자면 이름으로 인덱스를 찾음
      if (Character.isDigit(input.charAt(0))) {
        System.out.println(pokemonIndexMap.get(Integer.parseInt(input)));
      } else {
        System.out.println(pokemonNameMap.get(input));
      }
    }
  }
}
