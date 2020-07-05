package programmers.sum_of_integer_12912;

public class Solution {

    public long solution(int a, int b) {
        long answer = 0;
        for (int i = Math.min(a, b); i <=  Math.max(a, b); i++) {
            answer += i;
        }
        return answer;
    }

    /**
     * 가우스 원리를 이용하여 간단하게 해결 할 수 있다.
     */
    public long solution2(int a, int b) {
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        return (max - min + 1) * ((min + max) / 2);
    }
}
