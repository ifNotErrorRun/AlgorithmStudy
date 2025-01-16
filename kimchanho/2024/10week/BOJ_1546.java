import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BOJ_1546 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    List<Integer> list = Arrays.stream(br.readLine().split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());

    int max = list.stream().max(Integer::compare).get();
    double avg = list.stream().mapToDouble(Double::valueOf)
        .map(x -> x / max * 100)
        .sum() / n;
    System.out.println(avg);
  }
}
