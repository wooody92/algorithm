package programmers.level_1.finding_kim_12919;

import java.util.Arrays;

public class Solution {

    public String solution(String[] seoul) {
        int index = 0;
        String key = "Kim";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals(key)) {
                index = i;
                break;
            }
        }
        return "김서방은 " + index + "에 있다";
    }

    public String solution2(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + index + "에 있다";
    }
}
