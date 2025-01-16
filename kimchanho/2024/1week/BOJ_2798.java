import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BOJ_2798 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] rule = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    List<Integer> cards = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt)
        .collect(Collectors.toList());
    List<List<Integer>> result = new ArrayList<>();
    dfs(result, new LinkedList<>(), 0, cards, 3);
    List<Integer> set = result.stream()
        .map(list -> list.stream().mapToInt(Integer::intValue).sum())
        .distinct()
        .sorted()
        .filter(sum -> sum <= rule[1])
        .collect(Collectors.toList());
    int min = Integer.MAX_VALUE;
    int answer = 0;
    for (int sum : set) {
      int diff = Math.abs(rule[1] - sum);
      if (diff < min) {
        min = diff;
        answer = sum;
      } else {
        break;
      }
    }
    System.out.println(answer);

  }

  public static void dfs(List<List<Integer>> result, LinkedList<Integer> selected, int start,
      List<Integer> cards, int depth) {
    if (depth == 0) {
      result.add(new ArrayList<>(selected));
      return;
    }

    for (int i = start; i < cards.size(); i++) {
      selected.add(cards.get(i));
      dfs(result, selected, i + 1, cards, depth - 1);
      selected.removeLast();
    }
  }
}