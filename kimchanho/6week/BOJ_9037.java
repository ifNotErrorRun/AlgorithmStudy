import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_9037 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());
      int[] myCandy = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt)
          .toArray();

      int count = 0;
      while (true) {
        int[] dividedCandy = new int[N];
        for (int j = 0; j < N; j++) {
          // 홀수인 경우 짝수로 만들어줌
          if (myCandy[j] % 2 == 1) {
            myCandy[j]++;
          }
          // 캔디를 반으로 나누고 다음 캔디에 저장
          myCandy[j] /= 2;
          dividedCandy[(j + 1) % N] = myCandy[j];
        }

        // 모든 캔디 개수가 같으면 루프 종료
        boolean isAllSame = Arrays.stream(myCandy).allMatch(c -> myCandy[0] == c);
        if (isAllSame) {
          sb.append(count).append("\n");
          break;
        }

        // 나눈 캔디를 더해줌
        for (int j = 0; j < N; j++) {
          myCandy[j] += dividedCandy[(j + 2) % N];
        }
        count++;
      }
    }
    System.out.println(sb);
  }
}
