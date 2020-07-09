package programmers.remove_minimum_12935;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            if (min == arr[idx]) {
                i--;
                idx++;
                continue;
            }
            answer[i] = arr[idx];
            idx++;
        }
        return answer;
    }

    /**
     * stream 사용 할 수 있으나 느리므로 권장하지 않는다.
     */
    public int[] solution2(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{ -1 };
        }
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4, 3, 2, 1, 8, 5, 7, 6};
        System.out.println(Arrays.toString(solution.solution(arr)));
    }
}
