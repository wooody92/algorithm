package backjoon.palindrome_1254;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int result = getResult2(br.readLine());
        System.out.println(result);
    }

    private static int getResult(String str) {
        int length = str.length();
        String origin = str;
        for (int i = 0; i < length; i++) {
            if (isPalindrome(str)) {
                return length + i;
            }
            str = origin + reverse(str.substring(0, i + 1));
        }
        return length * 2;
    }

    /**
     * 조금 더 수학적인 방법
     */
    private static int getResult2(String input_Str) {
        int len = input_Str.length();
        for (int i = 0; i < len; i++) {
            if (isPalindrome(input_Str.substring(i))) {
                return i + len;
            }
        }
        return len * 2;
    }

    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() -1 - i)) {
                return false;
            }
        }
        return true;
    }
}
