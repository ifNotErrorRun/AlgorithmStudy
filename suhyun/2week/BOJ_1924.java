import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class BOJ_1924 {
    // 범용성 따지면 해당 코드가 좋음 시간은 두 코드 시간은 동일하고 메모리차이도 비슷
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekdays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int sum = 0;

        for (int i = 0; i < month - 1; i++) {
            sum += daysInMonth[i];
        }
        sum += day;
        System.out.println(weekdays[sum % 7]);

    }

    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        LocalDate localDate = LocalDate.of(2007, x, y);
        String result = localDate.getDayOfWeek().toString();
        System.out.println(result.substring(0, 3));
    }
}
