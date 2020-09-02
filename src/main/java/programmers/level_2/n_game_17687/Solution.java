package programmers.level_2.n_game_17687;

public class Solution {

    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        StringBuilder number = new StringBuilder();
        int k = 0;
        while (number.length() < t * m) {
            number.append(nConvert(n, k));
            k++;
        }
        String numbers = number.toString();

        for (int i = 0; i < t; i++) {
            int idx = (p - 1) + i * m;
            sb.append(numbers.charAt(idx));
        }
        return sb.toString();
    }

    public String nConvert(int n, int number) {
        String result = "";
        char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rest;
        if (number == 0) {
            return "0";
        }
        while (number > 0) {
            rest = number % n;
            number /= n;
            result = c[rest] + result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;
        System.out.println(solution.solution(n, t, m, p));
    }
}
