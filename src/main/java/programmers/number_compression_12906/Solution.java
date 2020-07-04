package programmers.number_compression_12906;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        int idx = 0;

        result.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (result.get(idx) != arr[i]) {
                result.add(arr[i]);
                idx++;
            }
        }

        answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution numberCompression = new Solution();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(numberCompression.solution(arr)));
    }
}
