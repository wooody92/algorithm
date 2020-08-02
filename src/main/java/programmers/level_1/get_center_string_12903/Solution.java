package programmers.level_1.get_center_string_12903;

public class Solution {

    public String solution(String s) {
        int oddIndex = (s.length() - 1) / 2;
        int evenIndex = (s.length() - 1) / 2;
        return s.length() % 2 != 0 ? String.valueOf(s.charAt(oddIndex))
            : String.valueOf(s.charAt(evenIndex)) + s.charAt(evenIndex + 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "qwer";
        System.out.println(solution.solution(s));
    }

    /**
     * String 내장함수로 한줄로 표현 가능
     */
    public String solution2(String word){
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
}
