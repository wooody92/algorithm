package programmers.tower_42588;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        answer[0] = 0;
        for (int i = 1; i < heights.length; i++) {
            int receiveTower = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (heights[i] < heights[j]) {
                    receiveTower = j + 1;
                    break;
                }
            }
            answer[i] = receiveTower;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] heights = {6, 9, 5, 7, 4};
        System.out.println(Arrays.toString(solution.solution(heights)));
    }
}
