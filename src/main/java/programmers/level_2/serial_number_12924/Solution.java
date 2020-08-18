package programmers.level_2.serial_number_12924;

public class Solution {

    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum >= n) {
                    break;
                }
            }
            if (sum == n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 15;
        System.out.println(solution.solution(n));
    }
}
