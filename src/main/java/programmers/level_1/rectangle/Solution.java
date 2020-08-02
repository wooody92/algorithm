package programmers.level_1.rectangle;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[][] v) {
        int[] answer = new int[2];

        for (int i = 0; i < 2; i++) {
            answer[i] = (v[0][i] == v[1][i]) ? v[2][i] : (v[0][i] == v[2][i]) ? v[1][i] : v[0][i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution rectangle = new Solution();
        int[][] v = {{30, 20}, {10, 10}, {10, 20}};
        System.out.println(Arrays.toString(rectangle.solution(v)));
    }
}
