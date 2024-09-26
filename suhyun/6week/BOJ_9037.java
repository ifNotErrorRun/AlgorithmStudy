import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_9037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine()); // 아이의 수
            int[] candies = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray(); // 초기 사탕 수

            // 초기 홀수 보충
            for (int i = 0; i < N; i++) {
                if (candies[i] % 2 != 0) {
                    candies[i]++;
                }
            }

            int cycles = 0;

            // 모든 아이가 같은 수의 사탕을 가질 때까지 반복
            while (!allEqual(candies)) {
                cycles++;
                candies = distributeCandies(candies);
            }

            System.out.println(cycles);
        }
    }

    // 모든 아이의 사탕 수가 같은지 확인하는 메서드
    private static boolean allEqual(int[] candies) {
        int first = candies[0];
        for (int candy : candies) {
            if (candy != first) {
                return false;
            }
        }
        return true;
    }

    // 사탕을 나누고 홀수일 경우 보충하는 메서드
    private static int[] distributeCandies(int[] candies) {
        int N = candies.length;
        int[] newCandies = new int[N];

        // 사탕 나누기
        for (int i = 0; i < N; i++) {
            int give = candies[i] / 2; // 절반을 오른쪽으로 준다
            newCandies[i] += candies[i] - give; // 남은 사탕
            newCandies[(i + 1) % N] += give; // 오른쪽 아이에게 준 사탕
        }

        // 홀수 처리
        for (int i = 0; i < N; i++) {
            if (newCandies[i] % 2 != 0) {
                newCandies[i]++;
            }
        }

        return newCandies;
    }
}
