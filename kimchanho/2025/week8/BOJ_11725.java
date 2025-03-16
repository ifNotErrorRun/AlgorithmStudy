import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_11725 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] parent = new int[n + 1];
    Map<Integer, Set<Integer>> tree = new HashMap<>();
    for (int i = 0; i < n - 1; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      tree.putIfAbsent(a, new HashSet<>());
      tree.putIfAbsent(b, new HashSet<>());
      tree.get(a).add(b);
      tree.get(b).add(a);
    }

    Queue<Integer> q = new LinkedList<>();
    q.offer(1);

    while(!q.isEmpty()) {
      int cur = q.poll();
      for (int child : tree.get(cur)) {
        if (parent[child] == 0) {
          parent[child] = cur;
          q.offer(child);
        }
      }
    }

    for (int i = 2; i <= n; i++) {
      System.out.println(parent[i]);
    }
  }

}
