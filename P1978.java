import java.io.*;
import java.util.*;

public class P1978 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] hapsungsu = new boolean[1001];

    public static void run(String[] args) throws IOException{
        int TC = Integer.parseInt(br.readLine());
        int[] cases = new int[TC];
        int num;
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 2; i < 1001; i++) {
            for (int j = 2; i*j < 1001; j++) {
                hapsungsu[i*j] = true;
            }
        }
        hapsungsu[0] = true;
        hapsungsu[1] = true;
        for (int i = 0; i < TC; i++) {
            num = Integer.parseInt(st.nextToken());
            if(hapsungsu[num]){
                continue;
            } else {
                result++;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
