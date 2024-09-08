import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BOJ_1978 {

    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 갯수는 현재 쓸모 없음
        br.readLine();
        int sum = 0;

        String[] strList = br.readLine().split(" ");
        List<Integer> integerList = Arrays.stream(strList).map(Integer::parseInt).collect(Collectors.toList());
        Optional<Integer> maxValue = integerList.stream().max(Integer::compareTo);

        if (maxValue.isPresent()) {
            // 가장 큰 원소로 채 만들어두고 리스트에 있는게 맞는지 아닌지 파악하기
            checkPrime(maxValue.get());
        }
        for (String str : strList) {
            int index = Integer.parseInt(str);
            if (isPrime[index]) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    // 에라토스테네스의 체 활용
    public static void checkPrime(int num) {

        isPrime = new boolean[num + 1];

        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        // 0이랑 1은 소수 아님
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (isPrime[i]) { // 소수인 경우 그 수 제외하고 배수를 모두 false로 변경
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

}
