package programmers.level_1.descending_sort_12917;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public String solution(String s) {
        List<Character> result = new ArrayList<>();
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i));
        }

        Collections.sort(result, Comparator.reverseOrder());
        for (int i = 0; i < result.size(); i++) {
            answer += result.get(i);
        }
        return answer;
    }

    /**
     * 문자열 sorting 시 StringBuilder를 사용하면 시간을 많이 단축 시킬 수 있다.
     */
    public String solution2(String s) {
        char[] result = s.toCharArray();
        Arrays.sort(result);
        return new StringBuilder(new String(result)).reverse().toString();
    }
}
