import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_25497 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    char[] commands = br.readLine().toCharArray();
    Map<Character, Character> preSkill = Map.of('R', 'L', 'K', 'S');
    Map<Character, Integer> preSkillCount = new HashMap<>();
    preSkillCount.put('L', 0);
    preSkillCount.put('S', 0);

    int count = 0;
    for (char command : commands) {
      if (command == 'L' || command == 'S') {
        preSkillCount.put(command, preSkillCount.get(command) + 1);
      } else if (command == 'R' || command == 'K') {
        if (preSkillCount.get(preSkill.get(command)) > 0) {
          preSkillCount.put(preSkill.get(command), preSkillCount.get(preSkill.get(command)) - 1);
          count++;
        } else {
          break;
        }
      } else {
        count++;
      }
    }

    System.out.println(count);
  }

}
