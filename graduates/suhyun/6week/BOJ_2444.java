import java.io.*;

public class BOJ_2444 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int k = 0;
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                writer.write(" ".repeat(n - i - 1));
                writer.write("*".repeat(2 * (i + 1) - 1));
                writer.newLine();
            } else {
                k++;
                writer.write(" ".repeat(k));
                writer.write("*".repeat(2 * Math.abs(n - k) - 1));
                writer.newLine();
            }
        }
        writer.flush();
    }
}
