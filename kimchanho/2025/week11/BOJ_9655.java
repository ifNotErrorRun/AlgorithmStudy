package week11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 상근 1
// 상근 3
// 상근 1 창영 1 = 2
// 상근 1 창영 3 = 4
// 상근 3 창영 1 = 4
// 상근 3 창영 3 = 6
// 반복
// 상근 선에서 멈추려면 홀수
// 창영 선에서 멈추려면 짝수
public class BOJ_9655 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    System.out.println(n % 2 == 0 ? "CY" : "SK");
  }
}
