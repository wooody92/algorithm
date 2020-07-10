package programmers.sum_or_matrix_12950;

import java.util.Arrays;

public class Solution {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][];

        for (int i = 0; i < arr1.length; i++) {
            answer[i] = new int[arr1[i].length]; // 2차원 배열의 초기화
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = {{1}, {3}};
        int[][] arr2 = {{3}, {5}};
        System.out.println(Arrays.toString(solution.solution(arr1, arr2)));
    }
}
