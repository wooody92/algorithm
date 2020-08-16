package programmers.level_2.carpet_42842;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int brown, int yellow) {
        List<Integer> divisors = getDivisor(brown + yellow);
        return getMinimum(brown + yellow, divisors);
    }

    // 약수 리스트 구하기
    public List<Integer> getDivisor(int number) {
        List<Integer> divisor = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
               divisor.add(i);
            }
        }
        return divisor;
    }

    // 약수와 몫의 합이 가장 작은 경우 구하기
    public int[] getMinimum(int number, List<Integer> divisor) {
        int[] result = new int[2];
        int min = number;
        for (int i = 0; i < divisor.size(); i++) {
            int sum = divisor.get(i) + (number / divisor.get(i));
            if (sum <= min) {
                min = sum;
                result[0] = divisor.get(i);
                result[1] = number / divisor.get(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int brown = 50;
        int yellow = 22;
        System.out.println(Arrays.toString(solution.solution(brown, yellow)));
    }
}
