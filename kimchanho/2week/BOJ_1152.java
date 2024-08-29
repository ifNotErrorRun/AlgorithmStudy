
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BOJ_1152 {

  // StringTokenizer 사용
  public static void solution1(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
    int length = stringTokenizer.countTokens();
    bw.write(String.valueOf(length));
    bw.flush();
  }

  // split 사용
  public static void solution2(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] words = br.readLine().trim().split(" ");
    bw.write(String.valueOf(words.length));
    bw.flush();
  }

  // 정규식 사용
  public static void solution3(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String sentence = " " + br.readLine();
    Pattern pattern = Pattern.compile(" [a-zA-Z]");
    Matcher matcher = pattern.matcher(sentence);
    long count = matcher.results().count();
    bw.write(String.valueOf(count));
    bw.flush();
  }
}