import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @title 기술 연계마스터 임스 (25497)
 * @description 기술을 사용하는 순서에 따라서 몇 번 기술을 사용할 수 있는지 출력하는 문제
 * @author Chanho Kim
 * @see https://www.acmicpc.net/problem/25497
 */
public class BOJ_25497 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    char[] commands = br.readLine().toCharArray();

    // 기술 연계맵과 기술 연계 큐
    Map<Character, Character> comboMap = Map.of('R', 'L', 'K', 'S');
    Map<Character, Queue<Character>> comboQueue = Map.of('L', new LinkedList<>(), 'S', new LinkedList<>());

    int skillCount = 0;
    for (char command : commands) {
      // 입력키가 연계키인 경우
      if (comboMap.containsValue(command)) {
        comboQueue.get(command).offer(command);
      } else {
        // 입력키가 기술키인 경우
        if (comboMap.containsKey(command)) {
          // 기술키를 가지고, 해당 큐에서 연계키 꺼내기를 시도, 없으면 null이 반횐되므로 종료
          Character cur = comboQueue.get(comboMap.get(command)).poll();
          //
          if (cur == null) break;
        }
        skillCount++;
      }
    }

    System.out.println(skillCount);
  }

}
