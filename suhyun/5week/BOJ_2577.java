import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] result = new int[10];

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int index = 0;
        int sum = A * B * C;
        String strSum = String.valueOf(sum);


        for (int i = 0; i < strSum.length(); i++) {
            if (sum / 10 > 0) {
                index = sum % 10;
                sum = sum / 10;
                result[index]++;
            } else {
                result[sum]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(result[i]);
        }

    }
}
