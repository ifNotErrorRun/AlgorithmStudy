import java.io.*;

public class BOJ_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        for (int i = n; i > 0; i--) {
            writer.write("*".repeat(i));
            writer.newLine();
        }
        writer.flush();
    }
}
