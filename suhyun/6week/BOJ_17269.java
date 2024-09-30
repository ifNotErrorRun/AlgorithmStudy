import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_17269 {

    static int[] alpha = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] lengths = br.readLine().split(" ");
        int n = Integer.parseInt(lengths[0]);
        int m = Integer.parseInt(lengths[1]);

        String[] names = br.readLine().split(" ");
        String nameA = names[0];
        String nameB = names[1];

        List<Integer> sequence = new ArrayList<>();
        int minLength = Math.min(n, m);
        for (int i = 0; i < minLength; i++) {
            sequence.add(alpha[nameA.charAt(i) - 'A']);
            sequence.add(alpha[nameB.charAt(i) - 'A']);
        }

        if (n > m) {
            for (int i = m; i < n; i++) {
                sequence.add(alpha[nameA.charAt(i) - 'A']);
            }
        } else {
            for (int i = n; i < m; i++) {
                sequence.add(alpha[nameB.charAt(i) - 'A']);
            }
        }

        while (sequence.size() > 2) {
            List<Integer> nextSequence = new ArrayList<>();
            for (int i = 0; i < sequence.size() - 1; i++) {
                nextSequence.add((sequence.get(i) + sequence.get(i + 1)) % 10);
            }
            sequence = nextSequence;
        }

        int result = sequence.get(0) * 10 + sequence.get(1);
        System.out.println(result + "%");
    }
}
