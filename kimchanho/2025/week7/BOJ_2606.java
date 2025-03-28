import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_2606 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<Integer, List<Integer>> network = new HashMap<>();

    int computers = Integer.parseInt(br.readLine());
    for (int i = 1; i <= computers; i++) {
      network.put(i, new ArrayList<>());
    }

    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int p1 = Integer.parseInt(st.nextToken());
      int p2 = Integer.parseInt(st.nextToken());
      network.get(p1).add(p2);
      network.get(p2).add(p1);
    }

    Set<Integer> visited = new HashSet<>();
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(1);

    while(!stack.isEmpty()) {
      int cur = stack.pop();
      if (visited.contains(cur)) {
        continue;
      } else {
        visited.add(cur);
      }

      List<Integer> nextComputers = network.get(cur);
      for (int com : nextComputers) {
        stack.push(com);
      }
    }
    System.out.println(visited.size() - 1);
  }
}
