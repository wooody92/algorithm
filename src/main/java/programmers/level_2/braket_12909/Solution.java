package programmers.level_2.braket_12909;

public class Solution {

    /**
     * s = ()))((() 와 같이 갯수가 일치해도 문법적으로 맞지 않는 경우도 확인해야 한다.
     */
    boolean solution(String s) {
        int result = 0;
        if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) == '(' ? result + 1 : result - 1;
            if (result < 0) {
                return false;
            }
        }
        return result == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "()))((()";
        System.out.println(solution.solution(s));
    }
}
