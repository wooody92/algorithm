package programmers.level_1.squar_discriminator_12934;

public class Solution {

    public long solution(long n) {
        double squareRoot = Math.sqrt(n);
        return squareRoot - (long) squareRoot == 0 ? (long) Math.pow(((long) squareRoot + 1), 2)
            : -1;
    }
}
