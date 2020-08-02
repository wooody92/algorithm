package programmers.level_1.collatz_12943;

public class Solution {

    public int solution(int num) {
        return (int) collatz(num, 0);
    }

    public long collatz(long n, int count) {
        if (n == 1) {
            return count;
        }
        if (count > 500) {
            return -1;
        }
        n = n % 2 == 0 ? n / 2 : (n * 3) + 1;
        count++;
        return collatz(n, count);
    }
}
