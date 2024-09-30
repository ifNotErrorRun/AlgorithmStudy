import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BOJ_17269 {

  public static void main(String[] args) throws IOException {

    int[] alphabets = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2,
        1};

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    Queue<Character> name1 = Arrays.stream(st.nextToken().split(""))
        .map(s -> s.charAt(0))
        .collect(Collectors.toCollection(LinkedList::new));
    Queue<Character> name2 = Arrays.stream(st.nextToken().split(""))
        .map(s -> s.charAt(0))
        .collect(Collectors.toCollection(LinkedList::new));

    int[] name = new int[N + M];
    for (int i = 0; i < name.length; i++) {
      if (i % 2 == 0 && !name1.isEmpty()) {
        name[i] = alphabets[name1.poll() - 'A'];
      } else if (i % 2 == 1 && !name2.isEmpty()) {
        name[i] = alphabets[name2.poll() - 'A'];
      } else if (i % 2 == 0 && name1.isEmpty()) {
        name[i] = alphabets[name2.poll() - 'A'];
      } else if (i % 2 == 1 && name2.isEmpty()) {
        name[i] = alphabets[name1.poll() - 'A'];
      }
    }

    while (name.length > 2) {
      int[] temp = new int[name.length - 1];
      for (int i = 0; i < temp.length; i++) {
        temp[i] = (name[i] + name[i + 1]) % 10;
      }
      name = temp;
    }

    System.out.println(name[0] * 10 + name[1] + "%");
  }
}
