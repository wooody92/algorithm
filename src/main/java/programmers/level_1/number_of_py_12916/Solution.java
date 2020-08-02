package programmers.level_1.number_of_py_12916;

public class Solution {

    boolean solution(String s) {
        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                p++;
            }
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y++;
            }
        }
        return p == y;
    }

    public static void main(String[] args) {
        Solution numberEquals = new Solution();
        String s = "pPoooyY";
        System.out.println(numberEquals.solution(s));
    }
}
