import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int input = Integer.parseInt(st.nextToken());
        int result = 1;
        for (int i = 1; i <= input; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
