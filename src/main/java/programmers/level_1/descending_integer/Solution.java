package programmers.level_1.descending_integer;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public long solution(long n) {
        String str = Long.toString(n);
        String[] number = str.split("");
        Arrays.sort(number, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length; i++) {
            sb.append(number[i]);
        }
        return Long.parseLong(sb.toString());
    }
}
