package programmers.level_2.making_prime_number_12977;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    /**
     * 소수 조건 검색은 2 <= i <= Math.sqrt(N)까지만 검색한다.
     * 주어진 수 N이 2부터 N 제곱근 범위에서 나누었을 때 0이 되는 수가 있다면, 그 수는 소수가 아니다.
     * 즉, 이 범위내 나누어지는 수가 없다면 그 수는 소수이다.
     */
    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 이 방법은 중복되는 prime check를 줄일 수 있다.
     */
    public int solution2(int[] nums) {
        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int key = nums[i] + nums[j] + nums[k];
                    if (sum.containsKey(key)) {
                        sum.put(key, sum.get(key) + 1);
                        continue;
                    }
                    sum.put(key, 1);
                }
            }
        }
        int result = 0;
        while (sum.size() > 0) {
            int number = sum.keySet().iterator().next();
            if (isPrime(number)) {
                result += sum.get(number);
            }
            sum.remove(number);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(solution.solution(nums));
    }
}
