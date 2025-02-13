import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @title 창문 닫기 (13909)
 * @description n개의 창문이 있을 때, 1부터 n까지 창문을 열고 닫을때 몇 개 창문이 열려있는지 구하기
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/13909
 */
public class BOJ_13909 {

  // 단순하게 반복문으로 돌리면서 열고 닫기 반복 -> 메모리 초과
  public static void main_try1(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());
    int[] arr = IntStream.generate(() -> 1).limit(n).toArray();

    if (n > 1) {
      for (int i = 2; i <= n; i++) {
        int j = i;
        while (j <= n) {
          arr[j - 1] = ~arr[j - 1];
          j += i;
        }
      }
    }
    long count = Arrays.stream(arr).filter(i -> i == 1).count();
    System.out.println(count);
  }

  // 각 자리수별로 약수를 구해서 약수가 홀수인 경우만 카운트 -> 시간 초과
  public static void main_try2(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int result = 0;

    for (int i = 1; i <= n; i++) {
      int divisor = 0;
      for (int j = 1; j * j <= i ; j++) {
        if (j * j == i) divisor++;
        else if (i % j == 0) divisor += 2;
      }
      if (divisor % 2 == 1) result++;
    }
    System.out.println(result);
  }

  // 규칙 찾기 -> 제곱수의 경우 약수의 개수가 홀수
  // n의 제곱근을 구하면 1부터 n까지의 창문 중 열린 창문의 개수를 구할 수 있음
  // 01) 1
  // 02) 1 0
  // ...
  // 04) 1 0 0 1
  // ...
  // 09) 1 0 0 1 0 0 0 0 1
  // ...
  // 16) 1 0 0 1 0 0 0 0 1 0 0 0 0 0 0 1
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    System.out.println((int) Math.sqrt(n));
  }
}
