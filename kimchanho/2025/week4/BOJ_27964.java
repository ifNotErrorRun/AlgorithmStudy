import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BOJ_27964 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine(); // skip n
    int cheeseToppings = Arrays.stream(br.readLine().split(" "))
        .filter(s -> s.endsWith("Cheese"))
        .collect(Collectors.toSet())
        .size();
    System.out.println(cheeseToppings >= 4 ? "yummy" : "sad");
  }
}
