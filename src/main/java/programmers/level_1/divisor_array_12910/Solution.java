package programmers.level_1.divisor_array_12910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                result.add(arr[i]);
            }
        }
        if (result.size() == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution divisorArray = new Solution();
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;
        System.out.println(Arrays.toString(divisorArray.solution2(arr, divisor)));
    }

    /**
     * stream을 이용하여 풀이도 가능하나 시간이 길어진다. 알고리즘 테스트에서는 어떤 풀이가 유리할까?
     */
    public int[] solution2(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        Arrays.sort(answer);
        if (answer.length == 0) {
            int[] nonAnswer = {-1};
            return nonAnswer;
        }
        return answer;
    }
}
