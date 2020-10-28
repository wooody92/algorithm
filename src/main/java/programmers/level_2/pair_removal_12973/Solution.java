package programmers.level_2.pair_removal_12973;

import java.util.Stack;

public class Solution {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        return stack.isEmpty() ? 1 : 0;
    }

    /**
     * 단순하게 가장 먼저 떠오르는 방식으로 해봤는데 실패했다.
     */
    public int solution2(String s) {
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
                if (i == s.length() - 2) {
                    sb.append(s.charAt(s.length() - 1));
                }
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
        String s = "cdcd";
        System.out.println(solution.solution(s));
    }
}
