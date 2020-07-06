package programmers.watermelon_12922;

public class Solution {

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        String word = "수박";
        char[] ch = word.toCharArray();
        for (int i = 0; i < n; i++) {
            sb.append(i % 2 == 0 ? ch[0] : ch[1]);
        }
        return sb.toString();
    }
}
