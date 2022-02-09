import java.io.*;

public class P1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void run() throws IOException{
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if(check(word) == true)
                count++;
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }

    static boolean check(String word) throws IOException {
        boolean[] alpabet = new boolean[26];
        int prev = 0;
        for (int i = 0; i < word.length(); i++) {
            int now = word.charAt(i);
            if(prev != now){
                if(alpabet[now-'a'] == true){
                    return false;
                }
                else{
                    alpabet[now-'a'] = true;
                    prev = now;
                }
            }
        }
        return true;
    }
}
