import java.io.*;
import java.util.*;

public class P5622 {
    // https://www.acmicpc.net/problem/5622

    // 입출력을 위한 변수 br, bw
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 총 걸리는 시간(초)를 저장하는 변수 sum
    static int sum = 0;

    // 각 알파벳을 걸리는 시간(다이얼의 숫자 + 1초)에 대응시켰음.
    static int[] num = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};

    // 실행 할 메소드
    public static void run(String[] args) throws IOException {
        // 입력받아서 input에 저장
        String input = br.readLine();

        // input 스트링 한 문장을 맨 앞에서부터 한 글자씩 검사
        for (int i = 0; i < input.length(); i++) {
            // 받은 문자 - 'A'를 하면 알파벳 기준 몇번째 문자인지 알 수 있다. ex) A는 0 B는 1 C는 2.... char은 askii 문자열 기준으로 숫자로 저장되기 때문
            // 해당 숫자에 대응된 걸리는 시간 배열에서 시간을 총 답안에 더해준다.
            sum += num[input.charAt(i) - 'A'];
        }

        // 출력
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}