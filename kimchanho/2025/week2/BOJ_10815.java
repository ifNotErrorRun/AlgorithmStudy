import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @title 숫자 카드 (10815)
 * @description 가지고 있는 카드면 1, 아니면 0을 출력
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/10815
 */
public class BOJ_10815 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 사이즈 입력값 무시
    br.readLine();
    Set<Integer> card = Arrays.stream(br.readLine().split(" "))
        .map(Integer::valueOf)
        .collect(Collectors.toSet());

    // 사이즈 입력값 무시
    br.readLine();
    Arrays.stream(br.readLine().split(" "))
        .map(Integer::valueOf)
        .map(i -> card.contains(i) ? 1 : 0)
        .forEach(i -> System.out.print(i + " "));
  }
}
