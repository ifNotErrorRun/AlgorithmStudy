import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = br.readLine().toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (i == chars.length / 2) {
                System.out.println(1);
            }

            if (chars[i] != chars[chars.length - i - 1]) {

                System.out.println(0);
                return;
            }
        }
    }
}
