package programmers.level_2.news_clustering_17677;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(String str1, String str2) {
        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        s1 = getList(str1.toLowerCase());
        s2 = getList(str2.toLowerCase());

        if (s1.isEmpty() && s2.isEmpty()) {
            return 65536;
        }

        // 교집합 갯수
        int intersection = 0;
        List<String> temp = new ArrayList<>();
        temp.addAll(s2);
        for (int i = 0; i < s1.size(); i++) {
            if (temp.size() == 0) {
                break;
            }
            if (temp.contains(s1.get(i))) {
                intersection++;
                temp.remove(s1.get(i));
            }
        }

        // 합집합 갯수
        int union = s1.size() + s2.size() - intersection;

        float result = (float) intersection / (float) union;
        return (int) (result * 65536);
    }

    public List<String> getList(String str) {
        List<String> bucket = new ArrayList<>();
        String regex = "^[a-zA-Z]*$";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).matches(regex)) {
                bucket.add(str.substring(i, i + 2));
            }
        }
        return bucket;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";
        System.out.println(solution.solution(str1, str2));
    }
}
