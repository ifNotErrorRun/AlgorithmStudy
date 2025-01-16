import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * @title 단어순서 뒤집기 (12605)
 * @description 문자열을 입력받아 단어의 순서를 뒤집어 출력하는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/12605
 */
public class BOJ_12605 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for (int i = 1; i <= n; i++) {
      Deque<String> stack = new ArrayDeque<>();
      StringBuilder sb = new StringBuilder("Case #" + i + ": ");
      StringTokenizer st = new StringTokenizer(br.readLine());
      while (st.hasMoreTokens()) {
        stack.push(st.nextToken());
      }

      // pop()을 이용하여 역순으로 출력
      while (!stack.isEmpty()) {
        sb.append(stack.pop()).append(" ");
      }
      System.out.println(sb);
    }
  }
}
