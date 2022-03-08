import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class P10757 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void run(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String one = st.nextToken();
        String two = st.nextToken();
        ArrayList<Integer> result = new ArrayList<Integer>();

        // reverse
        StringBuffer sb;
        sb = new StringBuffer(one);
        String oneRev = sb.reverse().toString();
        sb = new StringBuffer(two);
        String twoRev = sb.reverse().toString();

        int oneNum;
        int twoNum;
        int res;
        int add = 0;

        for (int i = 0; i < oneRev.length() && i < twoRev.length(); i++) {
            oneNum = Integer.parseInt(String.valueOf(oneRev.charAt(i)));
            twoNum = Integer.parseInt(String.valueOf(twoRev.charAt(i)));
            res = oneNum + twoNum + add;
            if(res >= 10){
                res -= 10;
                add = 1;
            }
            else{
                add = 0;
            }
            result.add(res);
        }

        if(oneRev.length() == twoRev.length()){
        } else if (oneRev.length() > twoRev.length()){
            int num = Integer.parseInt(String.valueOf(oneRev.charAt(twoRev.length()))) + add;
            if(num >= 10){
                num -= 10;
                add = 1;
            } else{
                add = 0;
            }
            result.add(num);
            for (int i = twoRev.length() + 1; i < oneRev.length(); i++) {
                num = Integer.parseInt(String.valueOf(oneRev.charAt(i))) + add;
                if(num >= 10) {
                    num -= 10;
                    add = 1;
                } else {
                    add = 0;
                }
                result.add(num);
            }
        } else {
            int num = Integer.parseInt(String.valueOf(twoRev.charAt(oneRev.length()))) + add;
            if(num >= 10){
                num -= 10;
                add = 1;
            } else{
                add = 0;
            }
            result.add(num);
            for (int i = oneRev.length() + 1; i < twoRev.length(); i++) {
                num = Integer.parseInt(String.valueOf(twoRev.charAt(i))) + add;
                if(num >= 10) {
                    num -= 10;
                    add = 1;
                } else {
                    add = 0;
                }
                result.add(num);
            }
        }

        if(add == 1){
            result.add(1);
        }

        Collections.reverse(result);

        for (int i = 0; i < result.size(); i++) {
            bw.write(String.valueOf(result.get(i)));
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
