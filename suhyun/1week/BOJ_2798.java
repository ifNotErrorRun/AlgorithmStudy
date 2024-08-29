import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2798 {

    // 입력받은 숫자 배열들
    static int[] arr;
    // 입시값 저장용
    static int[] tmp;
    // 최댓값
    static int max;
    // 딜러가 부른 최댓값
    static int M;

    public static void DFS(int L, int S) {
        // L이 3인 경우 max값 구하기
        if (L == 3) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += tmp[i];
            }
            if (sum <= M) {
                max = Math.max(max, sum);
            }
        } else {
            // 3이 아닌 경우 DFS함수를 불러서 계속 돌리기
            for (int i = S; i < arr.length; i++) {
                tmp[L] = arr[i];
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 카드 갯수
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        tmp = new int[3];
        max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            // 딜러가 준 카드들 집합
            arr[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0, 0);
        System.out.println(max);
    }
}