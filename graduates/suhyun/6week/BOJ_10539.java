import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_10539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        List<Integer> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            int o = Integer.parseInt(strArr[i]);
            if (i > 0) {
                o = o * (i + 1) - arr.stream().mapToInt(Integer::intValue).sum();
            }
            arr.add(o);
            sb.append(o + " ");
        }
        System.out.println(sb.toString());


    }
}
