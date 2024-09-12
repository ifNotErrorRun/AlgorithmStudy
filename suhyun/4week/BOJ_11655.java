import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11655 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        char[] charList = str.toCharArray();
        for (int i = 0; i < charList.length; i++) {

            // 소문자
            if (charList[i] >= 97 && charList[i] <= 122) {
                charList[i] += 13;
                if (charList[i] > 122) {
                    charList[i] = (char) (charList[i] - 122 + 97 - 1);
                }
            } else if (charList[i] >= 65 && charList[i] <= 90) {
                charList[i] += 13;
                if (charList[i] > 90) {
                    charList[i] = (char) (charList[i] - 90 + 65 - 1);
                }
            }
        }
        System.out.println(charList);


    }
}
