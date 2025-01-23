import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @title 콰트로치즈피자 (27964)
 * @description 각기 다른 치즈토핑이 4개 이상이면 yummy, 아니면 sad
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/27964
 */
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
