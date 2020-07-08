package programmers.reverse_number_12932;

import java.util.Arrays;

public class Solution {

    public int[] solution(long n) {
        int size = (int) Math.log10(n) + 1;
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long n = 9876543210L;
        System.out.println(Arrays.toString(solution.solution(n)));
    }
}
