package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_2309 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] arr = new int[9];
    for (int i = 0; i < 9; i++) {
      arr[i] = Integer.parseInt(reader.readLine());
    }
    Deque<Integer> result = new ArrayDeque<>();
    dfs(0, arr, result);
    StringBuilder sb = new StringBuilder();
    result.stream().sorted().forEach(i -> sb.append(i).append("\n"));
    writer.write(sb.toString());
    writer.flush();
  }

  public static boolean dfs(int start, int[] arr, Deque<Integer> combination) {
    int sum = combination.stream().mapToInt(Integer::valueOf).sum();
    if (combination.size() == 7 && sum == 100) {
      return true;
    } else if (combination.size() == 7) {
      return false;
    } else if (sum >= 100) {
      return false;
    }

    for (int i = start; i < arr.length; i++) {
      combination.offer(arr[i]);
      if (dfs(i + 1, arr, combination)) {
        return true;
      }
      combination.pollLast();
    }
    return false;
  }
}