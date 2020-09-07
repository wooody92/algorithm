package programmers.level_2.bracket_transform_60058;

public class Solution {

    public String solution(String p) {
        if (isRight(p)) {
            return p;
        }
        return recursive(p);
    }

    private String recursive(String w) {
        if (w.length() == 0) {
            return "";
        }
        int idx = getBalancedIndex(w) + 1;
        String u = w.substring(0, idx);
        String v = w.substring(idx);

        if (isRight(u)) {
            return u + recursive(v);
        }
        v = "(" + recursive(v) + ")";
        u = reverseBracket(u.substring(1, u.length() - 1));
        return v + u;
    }

    /**
     * "("와 ")" 갯수가 같을 때의 인덱스를 찾는다.
     */
    public int getBalancedIndex(String w) {
        int result = 0;
        for (int i = 0; i < w.length(); i++) {
            result = w.charAt(i) == '(' ? result + 1 : result - 1;
            if (result == 0) {
                return i;
            }
        }
        return w.length();
    }

    /**
     * 괄호의 방향이 올바른지 판단한다.
     */
    public boolean isRight(String bracket) {
        int result = 0;
        for (int i = 0; i < bracket.length(); i++) {
            result = bracket.charAt(i) == '(' ? result + 1 : result - 1;
            if (result < 0) {
                return false;
            }
        }
        return true;
    }

    public String reverseBracket(String bracket) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bracket.length(); i++) {
            if (bracket.charAt(i) == '(') {
                sb.append(")");
                continue;
            }
            sb.append("(");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String p = "()))((()";
        System.out.println(solution.solution(p));
    }
}
