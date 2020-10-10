package programmers.level_2.square_62048;

public class Solution {

    public long solution(int w, int h) {
        int gcd = getGCD(w, h);
        int broken = w + h - gcd;
        long total = (long) w * (long) h;
        return total - broken;
    }

    /**
     * 유클리드 호제법
     * n을 m으로 나눈 나머지를 n이라 하면 (단 n>m), n과 m의 최대공약수는 m과 r의 최대공약수와 같다.
     */
    public static int getGCD(int n, int m) {
        if (m == 0) {
            return n;
        }
        return getGCD(m, n % m);
    }
}
