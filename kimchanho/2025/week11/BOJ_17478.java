package week11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_17478 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
    recursive(sb, n, 0);
    System.out.println(sb);
  }

  public static void recursive(StringBuilder sb, int n, int depth) {
    String underline = "_".repeat(depth * 4);
    sb.append(underline).append("\"재귀함수가 뭔가요?\"\n");
    if (n == depth) {
      sb.append(underline).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
      sb.append(underline).append("라고 답변하였지.\n");
      return;
    } else {
      sb.append(underline).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
      sb.append(underline).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
      sb.append(underline).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
    }
    recursive(sb, n, depth + 1);
    sb.append(underline).append("라고 답변하였지.\n");
  }
}
