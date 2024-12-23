import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @title 괄호 (9012)
 * @description 괄호 문자열이 주어졌을 때, 문자열이 올바른 괄호 문자열인지 판단하기
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/9012
 */
public class BOJ_9012 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      char[] input = br.readLine().toCharArray();
      isVPS(input);
    }
  }

  public static void isVPS(char[] input) {
    Deque<Character> stack = new ArrayDeque<>();
    for (char c : input) {
      // 여는 괄호면 스택에 추가
      if (c == '(') {
        stack.push(c);
      // 닫는 괄호면 스택에서 제거
      } else {
        // 스택이 비어있으면 올바르지 않은 괄호 문자열이므로 NO 출력 후 종료
        if (stack.isEmpty()) {
          System.out.println("NO");
          return;
        }
        stack.pop();
      }
    }
    System.out.println(stack.isEmpty() ? "YES" : "NO");
  }
}