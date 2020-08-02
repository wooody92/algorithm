package programmers.level_1.custom_strings_sorting_12915;

import java.util.Arrays;

public class Solution {

    /**
     * Arrays.sort에 조건 람다식을 걸었을 때 동작원리 이해하기.
     *
     * 비교하는 두 개의 문자열의 n번째 문자열을 기준으로 정렬한다.
     * 비교하는 두 개의 문자열의 n번째 문자가 같다면 문자열 자체를 비교한다.
     */
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            if (o1.charAt(n) == o2.charAt(n)) {
                return o1.compareTo(o2);
            }
            return Character.compare(o1.charAt(n), o2.charAt(n));
        });
        return strings;
    }

    public static void main(String[] args) {
        Solution customSort = new Solution();
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(customSort.solution(strings, n)));
    }
}
