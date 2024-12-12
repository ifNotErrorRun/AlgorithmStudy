import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int original = N;
        int count = 0;

        do {
            int tens = N / 10;   // 10의 자리
            int ones = N % 10;   // 1의 자리
            int sum = tens + ones;


            N = (ones * 10) + (sum % 10);
            count++;
        } while (N != original);

        System.out.println(count);
    }
}
