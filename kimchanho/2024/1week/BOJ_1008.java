import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BOJ_1008 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<Double> nums = Arrays.stream(reader.readLine().split(" "))
        .map(Double::parseDouble)
        .collect(Collectors.toList());
    System.out.println(nums.get(0) / nums.get(1));
  }
}