import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class BOJ_4659 {

  public static final Set<String> vowels = Set.of("a", "e", "i", "o", "u");

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input;

    while (!(input = br.readLine()).equals("end")) {
      String[] word = input.split("");

      if (isBowelNotContain(word)
          || isSameLetterContinuous(word)
          || isVowelOrConsonantLetterContinuousThreeTimes(word)) {
        System.out.println("<" + input + "> is not acceptable.");
        continue;
      }

      System.out.println("<" + input + "> is acceptable.");
    }
  }

  public static boolean isBowelNotContain(String[] word) {
    return Arrays.stream(word).noneMatch(vowels::contains);
  }

  public static boolean isSameLetterContinuous(String[] word) {
    for (int i = 1; i < word.length; i++) {
      String prev = word[i - 1];
      String cur = word[i];
      if (prev.equals(cur) && !List.of("e", "o").contains(cur)) {
        return true;
      }
    }
    return false;
  }

  public static boolean isVowelOrConsonantLetterContinuousThreeTimes(String[] word) {
    for (int i = 2; i < word.length; i++) {
      boolean prevPrev = vowels.contains(word[i - 2]);
      boolean prev = vowels.contains(word[i - 1]);
      boolean cur = vowels.contains(word[i]);

      if (prevPrev == prev && prev == cur) {
        return true;
      }
    }
    return false;
  }
}
