package week11;

import java.io.BufferedReader;
import java.io.InputStreamReader;


// 시작과 끝이 같은 경우
// 시작값과 다른 값이 나올때까지 좌우 포인터를 이동
// 포인터 사이를 뒤집기
// ◆◇◇◇◆◆◆◆◇◇◆◆◆
// ◆◆◆◆◇◇◇◇◆◆◆◆◆
// ◆◆◆◆◆◆◆◆◆◆◆◆◆

// 시작과 끝이 다른 경우
// 시작값과 같은 값이 나올때까지 좌 포인터를 이동
// 포인터 사이를 뒤집기
// ◆◇◇◇◆◆◆◆◇◇◆◆◇
// ◆◆◆◆◇◇◇◇◆◆◇◇◆
// ◆◆◆◆◆◆◆◆◇◇◆◆◆
// ◆◆◆◆◆◆◆◆◆◆◆◆◆


public class BOJ_1439 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = br.readLine().chars().map(c -> c - '0').toArray();
    int lp = 0;
    int rp = arr.length - 1;
    int count = 0;

    // 시작과 끝의 값이 다른 경우, 같은 지점까지 이동
    if (arr[lp] != arr[rp]) {
      count++;
      while (arr[lp] != arr[rp]) {
        lp++;
      }
    } else {
      int curValue = arr[lp];
      while (arr[lp] == curValue && lp < arr.length - 1) {
        lp++;
      }
      while (curValue == arr[rp] && 0 < rp) {
        rp--;
      }
      if (lp <= rp) {
        count++;
      }
    }

    while (lp <= rp) {
      int curValue = arr[lp];
      while (curValue == arr[lp] && lp < arr.length - 1) {
        lp++;
      }
      while (curValue == arr[rp] && 0 < rp) {
        rp--;
      }
      if (lp < rp) {
        count++;
      } else if (lp == rp && arr[0] != (arr[lp] ^ (count % 2))) {
        count++;
      }
    }

    System.out.println(count);
  }
}
