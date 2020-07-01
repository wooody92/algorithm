package backjoon.date_calculate_1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int earth = Integer.parseInt(st.nextToken());
        int sun = Integer.parseInt(st.nextToken());
        int moon = Integer.parseInt(st.nextToken());

        int year = 1;
        int e = 1;
        int s = 1;
        int m = 1;
        while (true) {
            if (earth == e && sun == s && moon == m) {
                break;
            }
            year++;
            e++;
            s++;
            m++;
            if (e > 15) {
                e = 1;
            }
            if (s > 28) {
                s = 1;
            }
            if (m > 19) {
                m = 1;
            }
        }
        System.out.println(year);
    }

    /**
     *
     * 구글에서 본 최소공배수를 이용한 아름다운 풀이법
     */
    protected static void solution(int earth, int sun, int moon) {
        int year = 0;
        while (true) {
            year++;
            if ((year - earth) % 15 == 0 && (year - sun) % 28 == 0 && (year - moon) % 19 == 0) {
                break;
            }
        }
        System.out.print(year);
    }
}
