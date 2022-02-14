import java.io.*;
import java.util.*;

public class P2869 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void run(String[] args) throws IOException{
        int A, B, V;
        int day = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        V = V-A;
        day++;

        if(V>0){ // 한번에 올라가지 못한경우
            if(V/(A-B) == 0){
                day++;
            }
            else{
                day += V/(A-B);
                if(V%(A-B) != 0){
                    day++;
                }
            }
        }

        bw.write(String.valueOf(day));
        bw.flush();
        bw.close();
        br.close();
    }
}
