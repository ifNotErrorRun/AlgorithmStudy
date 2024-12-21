import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10709 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        // 결과용
        int[] result = new int[w];

        for (int i = 0; i < h; i++) {
            String str = br.readLine();
            char[] cloudList = str.toCharArray();

            // 첫 구름 조우
            boolean flag = true;

            int count = 0;

            for (int j = 0; j < w; j++) {

                // 처음 구름 있을 때
                if (cloudList[j] == 'c') {
                    result[j] = 0;
                    flag = false;
                    count = 0;
                }
                // 구름 조우 후 . 을 만났을 때
                else if (cloudList[j] == '.' && !flag) {
                    count++;
                    result[j] = count;
                }
                // 구름 없는 경우
                else {
                    result[j] = -1;
                }
                System.out.print(result[j] + " ");
            }
            System.out.println();

        }


    }
}
