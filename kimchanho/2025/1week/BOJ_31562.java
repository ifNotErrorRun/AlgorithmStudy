import java.io.*;
import java.util.*;

/**
 * @title 전주 듣고 노래 맞히기 (31562)
 * @description
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/31562
 */
public class BOJ_31562 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // StringTokenizer를 사용하여 공백을 기준으로 입력을 나누어 처리
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    Map<String, String> memo = new HashMap<>();

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      // 첫번째 토큰은 불필요한 값이므로 무시
      st.nextToken();
      String name = st.nextToken();
      // 코드 앞 3개를 합쳐서 key로 사용
      String code = st.nextToken() + st.nextToken() + st.nextToken();
      // 이미 key가 존재하면 "?"로 대체
      memo.put(code, memo.containsKey(code) ? "?" : name);
    }

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      // 코드 앞 3개를 합쳐서 key로 사용
      String code = st.nextToken() + st.nextToken() + st.nextToken();
      // memo에 key가 존재하면 value 출력, 없으면 "!" 출력  
      System.out.println(memo.containsKey(code) ? memo.get(code) : "!");
    }
  }
}