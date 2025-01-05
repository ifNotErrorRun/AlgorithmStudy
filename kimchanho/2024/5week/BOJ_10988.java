import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10988 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    char[] chars = br.readLine().toCharArray();
    int left = 0;
    int right = chars.length - 1;

    String result = "1";
    while (left < right) {
      if (chars[left] != chars[right]) {
        result = "0";
        break;
      }
      left++;
      right--;
    }
    System.out.println(result);
  }

//  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    String input = br.readLine();
//    String reversed = new StringBuilder(input).reverse().toString();
//    System.out.println(input.equals(reversed) ? "1" : "0");
//  }
}