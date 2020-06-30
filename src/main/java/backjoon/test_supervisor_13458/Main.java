package backjoon.test_supervisor_13458;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 시험장 수
        int N = Integer.parseInt(br.readLine());

        // 응시자 수
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 감독관이 감시할 수 있는 응시자 수
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        // 감독관 수
        long mainSupervisor = N;
        long subSupervisor = 0;

        for (int i = 0; i < N; i++) {
            A[i] -= B;
            if (A[i] > 0) {
                int t = A[i] / C;
                subSupervisor += t;
                if (A[i] % C > 0) {
                    subSupervisor++;
                }
            }
        }
        long result = mainSupervisor + subSupervisor;
        System.out.println(result);
    }
}
