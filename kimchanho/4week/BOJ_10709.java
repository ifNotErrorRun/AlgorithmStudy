import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10709 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int H = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < H; i++) {
      String clouds = br.readLine();
      for (int j = 0; j < W; j++) {
        String cloudPath = clouds.substring(0, j + 1);
        if (cloudPath.contains("c")) {
          sb.append(j - cloudPath.lastIndexOf("c"));
        } else {
          sb.append(-1);
        }
        sb.append(" ");
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
