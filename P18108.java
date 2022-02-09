import java.io.*;
public class P18108 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static public void run() throws IOException {
        int diff = 2541 - 1998;
        int year = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(year - diff));
        bw.flush();
        br.close();
        bw.close();
    }
}
