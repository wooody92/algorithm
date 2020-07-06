package programmers.string_to_integer_12925;

public class Solution {

    public int solution(String s) {
        if (s.contains("+") || s.contains("-")) {
            return s.charAt(0) == '+' ? Integer.parseInt(s.substring(1))
                : -Integer.parseInt(s.substring(1));
        }
        return Integer.parseInt(s);
    }
}
