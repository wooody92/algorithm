package backjoon.add_operator_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int min = 100000000;
    static int max = -100000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // init number size
        int n = Integer.parseInt(br.readLine());
        int[] number = new int[n];

        // init numbers
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        // init operators
        String operator = "+-*/";
        int[] operatorCount = new int[operator.length()];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < operator.length(); i++) {
            operatorCount[i] = Integer.parseInt(st.nextToken());
        }

        // 위에서 입력 받은 숫자의 갯수로 구성된 operator String 계산
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < operator.length(); i++) {
            for (int j = 0; j < operatorCount[i]; j++) {
                sb.append(operator.charAt(i));
            }
        }

        // permutation으로 연산자의 모든 경우의 수를 구하고 계산
        permutation(sb.toString().toCharArray(), 0, sb.length(), sb.length(), number);
        System.out.println(max);
        System.out.println(min);
    }

    static void permutation(char[] arr, int depth, int n, int r, int[] number) {
        if (depth == r) {
            int calculatedValue = calculate(arr, r, number);
            min = Math.min(min, calculatedValue);
            max = Math.max(max, calculatedValue);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r, number);
            swap(arr, depth, i);
        }
    }

    static void swap(char[] arr, int depth, int i) {
        char temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    // number 배열을 arr 연산자 배열의 순서대로 계산
    static int calculate(char[] arr, int r, int[] number) {
        int result = number[0];
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
            switch (arr[i]) {
                case '+' : result += number[i + 1];
                    break;
                case '-' : result -= number[i + 1];
                    break;
                case '*' : result *= number[i + 1];
                    break;
                case '/' : result /= number[i + 1];
                    break;
                default:
                    break;
            }
        }
        System.out.println();
        return result;
    }
}
