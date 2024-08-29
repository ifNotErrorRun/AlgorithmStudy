import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2742 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        int number = Integer.parseInt(input);

        printFac(number);

    }

    public static void printFac(int number) {

        System.out.println(number);

        if (--number > 0) {
            printFac(number);
        }
    }
}
