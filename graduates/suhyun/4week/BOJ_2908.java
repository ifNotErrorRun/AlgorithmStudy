import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int a = reverse(Integer.parseInt(st.nextToken()));
        int b = reverse(Integer.parseInt(st.nextToken()));

        int result = a > b ? a : b;
        System.out.println(result);

    }

    public static int reverse(int a) {

        String str = String.valueOf(a);
        StringBuffer sb = new StringBuffer(str);
        String reverseStr = sb.reverse().toString();
        int reverse = Integer.parseInt(reverseStr);

        return reverse;
    }
}
