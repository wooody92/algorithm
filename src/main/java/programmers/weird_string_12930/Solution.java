package programmers.weird_string_12930;

import java.util.Arrays;

public class Solution {

    public String solution(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] c = words[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                c[j] = (char) (j % 2 == 0 ? c[j] - 32 : c[j]);
            }
            words[i] = String.valueOf(c);
        }
        System.out.println(Arrays.toString(words));
        return stringArrayConverter(words);
    }

    private String stringArrayConverter(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            sb.append(string);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "try hello world";
        System.out.println(solution.solution(s));
    }
}
