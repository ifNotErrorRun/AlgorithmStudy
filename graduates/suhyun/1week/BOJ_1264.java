import java.util.Scanner;

public class BOJ_1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String a = sc.nextLine();
            if (a.equals("#")) {
                break;
            }
            a = a.toLowerCase();
            char[] cArray = a.toCharArray();
            int count = 0;

            for (char c : cArray) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            System.out.println(count);
        }

        sc.close();
    }
}
