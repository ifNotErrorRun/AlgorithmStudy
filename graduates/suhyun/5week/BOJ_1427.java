import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String number = String.valueOf(num);
        String sortedNumber = Arrays.stream(number.split(""))
                .sorted((a, b) -> b.compareTo(a))
                .reduce("", (a, b) -> a + b);

        System.out.println(sortedNumber);
    }
}
