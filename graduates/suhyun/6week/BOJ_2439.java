import java.io.*;

public class BOJ_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            writer.write(" ".repeat(n - i + 1));
            writer.write("*".repeat(i + 1));
            writer.newLine();
        }
        writer.flush();


    }
}
