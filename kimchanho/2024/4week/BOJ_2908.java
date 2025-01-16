import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
    int m = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
    System.out.println(Integer.max(n, m));
  }
}
