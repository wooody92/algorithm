package backjoon.resignation_14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 퇴사일 : n + 1
        int[] t = new int[n]; // 상담 완료까지 기간
        int[] p = new int[n]; // 상담 금액
        int result = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int totalPrice = 0;
            int totalDate = i;
            int idx = i;
            while (true) {
                totalDate += t[idx];
                if (totalDate > n) {
                    break;
                }
                totalPrice += p[idx];
                idx = totalDate;
                if (idx > n - 1) {
                    break;
                }
            }
            System.out.println(">>> total price : " + totalPrice);
            if (totalPrice > result) {
                result = totalPrice;
            }
        }
        System.out.println(result);
    }
}
