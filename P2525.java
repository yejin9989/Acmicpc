import java.io.*;
import java.util.*;

public class P2525 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void run(String[] args) throws IOException{
        int hour;
        int min;

        StringTokenizer st = new StringTokenizer(br.readLine());
        hour = Integer.parseInt(st.nextToken());
        min = Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());

        if(min >= 60){
            hour += min / 60;
            min -= (min/60)*60;
        }

        if(hour >= 24){
            hour -= (hour/24)*24;
        }

        bw.write(hour + " " + min);
        bw.flush();
        bw.close();
        br.close();

    }
}
