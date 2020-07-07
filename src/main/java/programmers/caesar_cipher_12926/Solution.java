package programmers.caesar_cipher_12926;

public class Solution {

    /**
     * 대문자는 대문자로만 돌아가고, 소문자는 소문자로만 돌아간다.
     * Z -> A, z -> a
     */
    public String solution(String s, int n) {
        char[] answer = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == ' ') {
                sb.append(answer[i]);
                continue;
            }
            answer[i] = isUpperCase(answer[i]) ? upperCase(answer[i], n) : lowerCase(answer[i], n);
            sb.append(answer[i]);
        }
        return sb.toString();
    }

    private boolean isUpperCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    private char upperCase(char c, int n) {
        c += n;
        if (c > 'Z') {
            c -= 26;
        }
        return c;
    }

    private char lowerCase(char c, int n) {
        c += n;
        if (c > 'z') {
            c -= 26;
        }
        return c;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Hello World"; // Gdkkn Vnqkc
        int n = 25;
        System.out.println(solution.solution(s, n));
    }
}
