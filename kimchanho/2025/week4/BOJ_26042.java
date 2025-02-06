import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @title 식당 입구 대기 줄 (26042)
 * @description 식당 입구 대기중인 줄의 최대길이와 최대길이일때의 학생 번호의 최소값을 구하기
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/26042
 */
public class BOJ_26042 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int max = 0;
    int lastStudent = 0;
    Deque<Integer> line = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      if (st.nextToken().equals("2")) {
        line.poll();
        continue;
      }
      int student = Integer.parseInt(st.nextToken());
      line.offer(student);

      if (line.size() == max) {
        lastStudent = Math.min(lastStudent, student);
      } else if (line.size() > max) {
        lastStudent = student;
        max = line.size();
      }
    }
    System.out.println(max + " " + lastStudent);
  }
}
