package programmers.harshad_12947;

public class Solution {

    public boolean solution(int x) {
        int temp = x;
        int sumOfDigit = 0;

        while (true) {
            sumOfDigit += temp % 10;
            temp /= 10;
            if (temp == 0) {
                break;
            }
        }
        return x % sumOfDigit == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
