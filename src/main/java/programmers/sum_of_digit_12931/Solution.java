package programmers.sum_of_digit_12931;

public class Solution {

    public int solution(int n) {
        int answer = 0;
        String[] splitNumber = String.valueOf(n).split("");
        for (int i = 0; i < splitNumber.length; i++) {
            answer += Integer.parseInt(splitNumber[i]);
        }
        return answer;
    }

    /**
     * 형변환 없이 산수 계산으로 처리 가능하다.
     * 가독성은 조금 떨어지지만 속도도 더 빠르다.
     */
    public int solution2(int n) {
        int answer = 0;
        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
