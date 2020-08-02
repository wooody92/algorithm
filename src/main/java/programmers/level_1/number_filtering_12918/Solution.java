package programmers.level_1.number_filtering_12918;

public class Solution {

    public boolean solution(String s) {
        if (!(s.length() == 4 || s.length() == 6)) {
            return false;
        }
        char[] result = s.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if ((result[i] > 57 || result[i] < 48)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "a234";
        System.out.println(solution.solution(s));
    }

    /**
     * 정규식으로 푸는 방법도 있다.
     */
    public boolean solution2(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
    }
}
