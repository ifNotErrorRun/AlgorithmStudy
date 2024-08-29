import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int number = Integer.parseInt(input);
        int count = 0;

        for (int i = 0; i < number; i++) {
            count = i;
            for (int j = 0; j < number; j++) {
                if (count > 0) {
                    System.out.print(" ");
                    count--;
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
}
