package programmers.level_1.number_list_12954;

import java.util.Arrays;

public class Solution {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (long) x * (i + 1); // int 자료형끼리의 연산 시 int 범위 이상이 넘어가면 데이터 손실이 발생하여 형변환 해줬다.
        }
        return answer;
    }

    /**
     * 곱셈 연산보다는 덧셈 연산으로 해결하자
     */
    public long[] solution2(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < answer.length; i++) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution2(10000000, 1000)));
    }
}
