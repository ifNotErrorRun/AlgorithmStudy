import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_4344 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      int[] all = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
      int[] scores = Arrays.copyOfRange(all, 1, all.length);
      double avg = Arrays.stream(scores).sum() / (double) all[0];
      long count = Arrays.stream(scores).filter(score -> score > avg).count();
      String format = String.format("%.3f", 100.0 * count / all[0]);
      System.out.println(format + "%");
    }

  }
}
