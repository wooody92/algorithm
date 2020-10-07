package backjoon.barket_2504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        Stack<String> stack = new Stack<>();
        String[] array = str.split("");

        if (!isValidString(str)) {
            System.out.println(0);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("(") || array[i].equals("[")) {
                stack.push(array[i]);
                continue;
            }
            if (array[i].equals(")")) {
                if (stack.peek().equals("(")) {
                    stack.pop();
                    stack.push("2");
                    continue;
                }
                // loop
            }
            if (array[i].equals("]")) {
                if (stack.peek().equals("[")) {
                    stack.pop();
                    stack.push("3");
                    continue;
                }
                // loop
            }

        }
    }

    public static int loop() {

        return 0;
    }

    static boolean isValidString(String s) {
        int round = 0;
        int rectangle = 0;
        if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
            return false;
        }
        if (s.charAt(0) == ']' || s.charAt(s.length() - 1) == '[') {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' : round++;
                    break;
                case ')' : round--;
                    break;
                case '[' : rectangle++;
                    break;
                case ']' : rectangle--;
                    break;
                default :
                    return false;
            }
            if (round < 0 || rectangle < 0) {
                return false;
            }
        }
        return round == 0 && rectangle == 0;
    }
}
