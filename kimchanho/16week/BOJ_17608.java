import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @title 막대기 (17608)
 * @description 보이는 막대기의 개수를 출력하는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/17608
 */
public class BOJ_17608 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Deque<Integer> stack = new ArrayDeque<>();
    for (int i = 0; i < N; i++) {
      stack.push(Integer.parseInt(br.readLine()));
    }

    int max = 0;
    int count = 0;
    while (!stack.isEmpty()) {
      int current = stack.pop();
      // 현재 막대기가 가장 긴 막대기보다 길면 보이는 막대기로 카운트하고 max값을 업데이트
      if (max < current) {
        count++;
        max = current;
      }
    }
    System.out.println(count);
  }

}
