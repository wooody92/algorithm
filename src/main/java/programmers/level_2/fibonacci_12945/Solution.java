package programmers.level_2.fibonacci_12945;

public class Solution {

    public int solution(int n) {
        int[] number = new int[n + 1];
        number[0] = 0;
        number[1] = 1;

        int k = 1234567;
        for (int i = 2; i <= n; i++) {
            number[i] = number[i - 1] % k + number[i - 2] % k;
        }
        return number[n] % k;
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public int memorization(int n, int[] number) {
        if (n <= 1) {
            return n;
        }
        if (number[n] != 0) {
            return number[n];
        }
        number[n] = memorization(n - 1, number) + memorization(n - 2, number);
        return number[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        int[] number = new int[n + 1];
        System.out.println(solution.memorization(n, number));
        System.out.println(solution.solution(5));
    }
}
