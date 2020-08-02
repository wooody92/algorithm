package programmers.level_1.weird_string_12930;

public class Solution {

    public String solution(String s) {
        char[] c = s.toCharArray();
        boolean flag = true;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                flag = true;
                continue;
            }
            if (flag) {
                c[i] = Character.toUpperCase(c[i]);
                flag = false;
                continue;
            }
            c[i] = Character.toLowerCase(c[i]);
            flag = true;
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "try hello world";
        System.out.println(solution.solution(s));
    }
}
