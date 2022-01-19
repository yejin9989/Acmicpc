import java.io.*;
import java.util.*;

public class P8980 {
    // https://www.acmicpc.net/problem/8980

    // 입출력을 위한 변수 br, bw
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 마을 수 N, 트럭의 용량 C, 보내는 박스 정보의 개수 M
    static int N, C, M;

    // 마을 별 적재량을 저장하는
    static Integer[] bus;

    // 배송 정보를 담는 클래스
    static class info{
        int start;
        int end;
        int weight;

        public info(int start, int end, int weight){
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }

    // 배송 정보를 저장하는 배열
    static info[] delivery;

    // 배송한 짐의 합
    static int sum = 0;

    // 실행 할 메소드
    public static void run() throws IOException {
        // 입력받아서 input에 저장
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(br.readLine());

        bus = new Integer[N];
        delivery = new info[M];

        for (int i = 0; i < N; i++) {
            bus[i] = new Integer(0);
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());
            int weight = Integer.parseInt(st2.nextToken());
            delivery[i] = new info(start, end, weight);
        }

        // 도착지순서로 정렬
        for (int i = 0; i < M-1; i++) {
            int min = i;
            for (int j = i+1; j < M; j++) {
                if(delivery[j].end < delivery[min].end){
                    min = j;
                }
            }
            info temp = new info(delivery[min].start, delivery[min].end, delivery[min].weight);
            delivery[min] = new info(delivery[i].start, delivery[i].end, delivery[i].weight);
            delivery[i] = new info(temp.start, temp.end, temp.weight);
        }

        for (int i = 0; i < M; i++) {
            int min = C;
            for (int j = delivery[i].start-1; j < delivery[i].end-1; j++) {
                if(C-bus[j] < min){
                    min = C-bus[j];
                }
            }
            int volume = delivery[i].weight > min ? min : delivery[i].weight;
            sum += volume;
            for (int j = delivery[i].start-1; j < delivery[i].end-1; j++) {
                bus[j] += volume;
            }
        }

        // 출력
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}