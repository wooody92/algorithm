package programmers.number_of_prime_12921;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * Solution 1 - 성공
     * 소수 조건 검색은 2 <= i <= Math.sqrt(N)까지만 검색한다.
     * 주어진 수 N이 2부터 N 제곱근 범위에서 나누었을 때 0이 되는 수가 있다면, 그 수는 소수가 아니다.
     * 즉, 이 범위내 나누어지는 수가 없다면 그 수는 소수이다.
     */
    public int solution(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers.size();
    }

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
     * Solution 2 - 효율성 검사 실패
     * n보다 작은 소수로만 나누는 방식
     */
    public int solution2(int n) {
        List<Integer> prime = new ArrayList<>();
        prime.add(2);
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < prime.size(); j++) {
                if (prime.get(j) > Math.sqrt(n)) {
                    break;
                }
                if (i % prime.get(j) == 0) {
                    break;
                }
                if (j == prime.size() - 1) {
                    prime.add(i);
                }
            }
        }
        return prime.size();
    }

    /**
     * Solution 3 - 시간 초과 및 효율성 검사 실패
     * 단순한 방식
     */
    public int solution3(int n) {
        int answer = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i - 1) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(1000));
    }
}
