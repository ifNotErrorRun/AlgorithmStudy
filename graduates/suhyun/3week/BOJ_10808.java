import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 아스키로 만들고 65로 뺀 다음 뺀 걸로 인덱스 채우고 해당 값에 ++해주면 되지 않을까?
        String str = st.nextToken();
        char[] charList = str.toCharArray();
        int[] result = new int[26];

        for (char ch : charList) {
            int index = ch - 97;
            result[index]++;
        }

        for (int count : result) {
            System.out.print(count + " ");
        }
    }
}
