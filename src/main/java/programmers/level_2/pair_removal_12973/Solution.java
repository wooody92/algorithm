package programmers.level_2.pair_removal_12973;

public class Solution {

    public int solution(String s) {

        while (s.length() > 0) {
            StringBuilder sb = new StringBuilder();
            boolean flag = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                    flag = true;
                    continue;
                }
                sb.append(s.charAt(i));
            }
            s = sb.toString();
            if (!flag) {
                break;
            }
        }
        return s.length() > 0 ? 0 : 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "baabaa";
        System.out.println(solution.solution(s));
    }
}
