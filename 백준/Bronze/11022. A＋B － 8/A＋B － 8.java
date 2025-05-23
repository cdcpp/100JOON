import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        for(int i = 1; i <= n; i++) {
           String s = bf.readLine();
           StringTokenizer st = new StringTokenizer(s);
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
        }

        bw.flush();
        bw.close();


    }
}