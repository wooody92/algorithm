package backjoon.start_link_14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int min = 2147483647;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] ability = new int[n][n];

        boolean[] visited = new boolean[n];
        int r = n / 2;

        // 팀 능력치 설정
        for (int i = 0; i < ability.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < ability[i].length; j++) {
                ability[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        combination(visited, 0, n, r, ability);
        System.out.println(min);
    }
    /**
     * visited는 0 ~ n-1까지 각 인덱스에 true, false를 부여하여 판별 용도로 쓰인다.
     */
    static void combination(boolean[] visited, int depth, int n, int r, int[][] ability) {
        if (r == 0) {
            min = Math.min(min, getAbilityDifference(visited, n, ability));
            return;
        }
        if (depth == n) {
            return;
        }

        visited[depth] = true;
        combination(visited, depth + 1, n, r - 1, ability);
        visited[depth] = false;
        combination(visited, depth + 1, n, r, ability);
    }

    /**
     * visited == true 팀과 visited == false 팀으로 나누어 ability에서 해당 인덱스들이 가진 합을 구한다.
     * 이 과정을 combination으로 나온 조합의 수 만큼 반복한다.
     */
    static int getAbilityDifference(boolean[] visited, int n, int[][] ability) {
        int sumOfStart = 0;
        int sumOfLink = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i] && visited[j]) {
                    sumOfStart += ability[i][j];
                }
                if (!visited[i] && !visited[j]) {
                    sumOfLink += ability[i][j];
                }
            }
        }
        return Math.abs(sumOfStart - sumOfLink);
    }
}
