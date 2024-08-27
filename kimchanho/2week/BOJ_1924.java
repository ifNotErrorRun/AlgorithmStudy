import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_1924 {

  public static void main(String[] args) throws IOException {

    String[] days = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    int[] monthDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(reader.readLine());
    int m = Integer.parseInt(st.nextToken());
    int d = Integer.parseInt(st.nextToken());

    int[] cumulativeMonthDays = new int[12];
    for (int i = 1; i < 12; i++) {
      cumulativeMonthDays[i] += cumulativeMonthDays[i - 1] + monthDays[i - 1];
    }

    int day = (cumulativeMonthDays[m - 1] + d - 1) % 7;
    writer.write(days[day]);
    writer.flush();
  }
}