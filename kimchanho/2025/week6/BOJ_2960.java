import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @title 에라토스테네스의 채 (2960)
 * @description 에라토스테네스의 채라는 소수 찾는 방법을 이용하여 n번째 지워지는 수를 구하기
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/2960
 */
public class BOJ_2960 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    // 인덱스 번호를 맞추기 위해 n + 1로 설정
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int[] arr = new int[n + 1];
    // 0, 1을 제외하고 1로 초기화
    Arrays.fill(arr, 2, arr.length, 1);
    int i = 1;

    // 2부터 n까지 반복
    while (i++ < arr.length - 1) {
      // 이미 지워진 수면 다음 수로 넘어감
      if (arr[i] == 0) {
        continue;
      }

      // 현재 가장 작은 수를 j에 저장
      int j = i;
      // j의 배수를 찾아서 1이면 0으로 바꾸고 k를 감소시킴
      while (j <= n) {
        if (arr[j] == 1) {
          arr[j] = 0;
          k--;
          // k가 0이면 마지막으로 지운 수(j)를 출력하고 종료
          if (k == 0) {
            System.out.println(j);
            return;
          }
        }
        j += i;
      }
    }
  }
}
