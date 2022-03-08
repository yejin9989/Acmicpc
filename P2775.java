import java.io.*;
import java.util.*;

public class P2775 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void run(String[] args) throws IOException{
        int TC = Integer.parseInt(br.readLine());
        int[][] arr = new int[15][15];
        for (int i = 0; i < 15; i++) {
            arr[0][i] = i;
        }
        for (int i = 1; i < 15; i++) {
            arr[i][0] = arr[i-1][0];
            for (int j = 1; j < 15; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        for (int i = 0; i < TC; i++) {
            int k, n;
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(arr[k][n])+'\n');
            bw.flush();
        }
    }
}
