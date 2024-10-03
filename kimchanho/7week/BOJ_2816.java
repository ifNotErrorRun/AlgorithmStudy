import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2816 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] channels = new String[N];

    int[] kbs = {0, 0};
    for (int i = 0; i < N; i++) {
      channels[i] = br.readLine();
    }

    StringBuilder sb = new StringBuilder();
    int cursor = 0;
    for (int i = 0; i < kbs.length; i++) {
      String key = "KBS" + (i + 1);
      for (int j = 0; j < channels.length; j++) {
        if (channels[j].equals(key)) {
          kbs[i] = j;
        }
      }
      while (cursor != kbs[i]) {
        sb.append("1");
        cursor = cursor < channels.length - 1 ? cursor + 1 : cursor;
      }
      while (kbs[i] != i) {
        sb.append("4");
        if (cursor > 0) {
          String temp = channels[cursor];
          channels[cursor] = channels[cursor - 1];
          channels[cursor - 1] = temp;
          cursor = cursor - 1;
          kbs[i] = cursor;
        }
      }
    }
    System.out.println(sb);
  }
}
