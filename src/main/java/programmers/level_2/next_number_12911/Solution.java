package programmers.level_2.next_number_12911;

public class Solution {

    /**
     * 나의 풀이법과 동일한 방식이지만 bitCount 메서드를 이용하여 간결하게 풀이하였다.
     */
    public int solution(int n) {
        int count = Integer.bitCount(n);
        while (true) {
            n++;
            int myCount = Integer.bitCount(n);
            if (count == myCount) {
                return n;
            }
        }
    }

    public int solution2(int n) {
        String str = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }

        while (true) {
            int myCount = 0;
            n++;
            str = Integer.toBinaryString(n);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    myCount++;
                }
            }
            if (count == myCount) {
                return n;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 15;
        System.out.println(solution.solution(n));
    }
}
