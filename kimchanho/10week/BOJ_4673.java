import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BOJ_4673 {

  public static void main(String[] args) {
    Set<Integer> map = IntStream.rangeClosed(1, 10000)
        .mapToObj(BOJ_4673::constructorNum)
        .collect(Collectors.toSet());

    StringBuilder sb = new StringBuilder();
    IntStream.rangeClosed(1, 10000)
        .filter(i -> !map.contains(i))
        .forEach(i -> sb.append(i).append("\n"));
    System.out.println(sb);
  }

  public static int constructorNum(int i) {
    int n = i;
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    sum += i;
    return sum;
  }
}
