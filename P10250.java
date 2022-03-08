import java.io.*;
import java.util.*;

public class P10250 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void run(String[] args) throws IOException{
        int TC;
        int H, W, N;
        TC = Integer.parseInt(br.readLine());
        for (int i = 0; i < TC; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            if(N == 1){
                bw.write("101\n");
                bw.flush();
                continue;
            }

            int floor, room;
            String zero = "";

            floor = (N-1)%H + 1;
            room = (N-1)/H + 1;

            if(room < 10){
                zero = "0";
            }

            bw.write(String.valueOf(floor)+zero+room+'\n');
            bw.flush();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}