import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ_2309 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 오름차순 정렬
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                List<Integer> selectList = new ArrayList<>();

                // 7개만 되도록
                for (int k = 0; k < numbers.length; k++) {
                    if (k != i && k != j) {
                        selectList.add(numbers[k]);
                    }
                }

                int sum = 0;

                for (int num : selectList) {
                    sum += num;
                }

                if (sum == 100) {
                    for (int num : selectList) {
                        System.out.println(num);
                    }
                    return;
                }
            }
        }
    }
}
