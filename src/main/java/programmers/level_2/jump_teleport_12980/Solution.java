package programmers.level_2.jump_teleport_12980;

public class Solution {

    public int solution(int n) {
        int result = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                result++;
            }
            n /= 2;
        }
        return result;
    }
}
