package programmers.level_2.biggest_number_42746;

import java.util.Arrays;

public class Solution {

    public String solution(int[] numbers) {
        String[] num = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            num[i] = String.valueOf(numbers[i]);
        }

        // 두 String 객체를 더해서 큰 수에 우선순위가 있도록 정렬한다.
        // result가 0이나 음수이면 자리바꿈을 하지 않고, 양수이면 자리바꿈을 수행한다.
        Arrays.sort(num, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (num[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            sb.append(num[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {3, 39, 34, 5111, 51, 529, 9, 990, 99, 90, 908, 1, 1000};
        System.out.println(solution.solution(numbers));
    }
}
