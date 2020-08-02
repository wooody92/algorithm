package programmers.level_1.sum_of_divisor_12928;

public class Solution {

    /**
     * n의 약수는 n/2보다 클 수 없으므로 조회 범위를 줄인다.
     */
    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
