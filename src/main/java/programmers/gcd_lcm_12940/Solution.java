package programmers.gcd_lcm_12940;

import java.util.Arrays;

public class Solution {

    public int[] solution(int n, int m) {
        int[] answer = {getGCD(n, m), getLCM(n, m)};
        return answer;
    }

    private int getGCD(int n, int m) {
        int result = 1;
        int max = Math.abs(n - m) < Math.min(n, m) ? Math.abs(n - m) : Math.min(n, m);
        for (int i = 1; i <= max; i++) {
            if (n % i == 0 && m % i == 0) {
                result = i;
            }
        }
        return result;
    }

    private int getLCM(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int i = 1;
        while (true) {
            int temp = max * i;
            if (temp % min == 0) {
                return temp;
            }
            i++;
        }
    }

    /**
     * 유클리드 호제법
     * n을 m으로 나눈 나머지를 n이라 하면 (단 n>m), n과 m의 최대공약수는 m과 r의 최대공약수와 같다.
     */
    public static int getGCD2(int n, int m) {
        if (m == 0) {
            return n;
        }
        return getGCD2(m, n % m);
    }

    private int getLCM2(int n, int m) {
        return (n * m) / getGCD(n, m);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(7, 10)));
    }
}
