import java.io.*;
import java.util.*;

public class P2941 {
    // https://www.acmicpc.net/problem/5622

    // 입출력을 위한 변수 br, bw
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 크로아티아 알파벳 대체 문자열 배열
    static String croatia = "(c=)|(c-)|(dz=)|(d-)|(lj)|(nj)|(s=)|(z=)";

    // 실행 할 메소드
    public static void run(String[] args) throws IOException {
        // 입력받아서 input에 저장
        String input = br.readLine();

        // 크로아티아 알파벳에 해당하는 문자들을 다 "1 "(1과 공백)으로 치환해준다.
        // 정규표현식 활용
        input = input.replaceAll(croatia, "1 ");

        // 크로아티아 알파벳을 제외하면 그냥 하나씩이다
        input = input.replaceAll("[a-z]", "1 ");

        // 공백으로 구분
        String[] token = input.split("\\p{Space}");

        // 토큰 길이 출력
        bw.write(String.valueOf(token.length));
        bw.flush();
        bw.close();
        br.close();
    }
}