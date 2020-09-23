package programmers.level_2.tuple_64065;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public int[] solution(String s) {
        String[] str = s.split("}");
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceAll("\\{", "").replaceAll("}", "");
            if (str[i].charAt(0) == ',') {
                str[i] = str[i].substring(1);
            }
        }

        Arrays.sort(str, (o1, o2) -> {
            Integer l1 = o1.length();
            Integer l2 = o2.length();
            return l1.compareTo(l2);
        });

        List<Integer> bucket = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            String[] temp = str[i].split(",");
            for (String string : temp) {
                if (!bucket.contains(Integer.parseInt(string))) {
                    bucket.add(Integer.parseInt(string));
                }
            }
        }

        int[] result = new int[bucket.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = bucket.get(i);
        }
        return result;
    }

    /**
     * Set을 이용한 다른 사람의 풀이
     */
    public int[] solution2(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) {
                    answer[idx++] = Integer.parseInt(s2);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        System.out.println(solution.solution(s));
    }
}
