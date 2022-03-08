import java.io.*;
import java.util.*;

public class P2480 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void run(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dice = new int[3];
        int money = 0;

        dice[0] = Integer.parseInt(st.nextToken());
        dice[1] = Integer.parseInt(st.nextToken());
        dice[2] = Integer.parseInt(st.nextToken());

        if(dice[0] == dice[1] && dice[1] == dice[2]){
            // match three dice
            money += 10000 + 1000 * dice[0];
        } else if(dice[0] == dice[1]){
            // match dice 0 and dice 1
            money += 1000 + 100 * dice[0];
        } else if(dice[1] == dice[2]){
            // match dice 1 and dice 2
            money += 1000 + 100 * dice[1];
        } else if(dice[2] == dice[0]){
            // match dice 2 and dice 0
            money += 1000 + 100 * dice[2];
        } else {
            // nothing match
            if(dice[0]>=dice[1] && dice[0]>=dice[2]){
                // max : dice 0
                money += 100 * dice[0];
            } else if (dice[1]>=dice[2] && dice[1]>=dice[0]) {
                // max : dice 1
                money += 100 * dice[1];
            } else{
                // max : dice 2
                money += 100 * dice[2];
            }
        }
        bw.write(String.valueOf(money));
        bw.flush();
        bw.close();
        br.close();
    }
}
