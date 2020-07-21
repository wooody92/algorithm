package programmers.country_of_124_12899;

public class Solution {

    public String solution(int n) {
        String answer = "";
        String[] numbers = {"4", "1", "2"};

        while (n > 0) {
            int remainder = n % 3;
            n /= 3;
            if (remainder == 0) {
                n--;
            }
            answer = numbers[remainder] + answer;
        }
        return answer;
    }

    /**
     * 다른 사람의 풀이
     * 내가 풀이한 -1을 해주는 방식보다 수학적으로 더 맞는 방식으로 보인다.
     */
    public String solution2(int n) {
        String[] num = {"4", "1", "2"};
        String answer = "";

        while (n > 0) {
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
    }
}
