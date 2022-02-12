import java.io.*;
import java.util.*;

public class P1712 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void run() throws IOException{
        int A, B, C; // 각각 고정비용, 변동비용, 한 대당 가격
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        // n > A/(C-B)
        if(C-B <= 0) {
            bw.write("-1");
        }
        else{
            bw.write(String.valueOf((A/(C-B))+1));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
