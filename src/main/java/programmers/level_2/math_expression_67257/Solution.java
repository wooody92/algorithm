package programmers.level_2.math_expression_67257;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. 숫자 리스트와 연산자 리스트로 파싱 2. 연산자 인덱스 연산 후 결과값을 숫자 인덱스에 입력. 연산자와 숫자 인덱스 + 1은 제거 3. +, -, * 순서를 바꾸어가며
 * 최대값 찾기
 */
public class Solution {

    public long solution(String expression) {
        // parsing
        List<Long> numbers = new ArrayList<>();
        List<String> operators = new ArrayList<>();
        String[] number = expression.replaceAll("\\+", ",")
            .replaceAll("-", ",")
            .replaceAll("\\*", ",")
            .split(",");

        for (int i = 0; i < number.length; i++) {
            numbers.add(Long.parseLong(number[i]));
        }
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) >= '0' && expression.charAt(i) < '9') {
                continue;
            }
            operators.add(String.valueOf(expression.charAt(i)));
        }

        // logic
        long result = 0;
        String[][] orders = {{"-", "*", "+"}, {"*", "-", "+"}, {"*", "+", "-"}, {"+", "*", "-"}, {"+", "-", "*"}, {"-", "+", "*"}};

        for (int k = 0; k < orders.length; k++) {
            List<Long> tempNumbers = new ArrayList<>();
            List<String> tempOperators = new ArrayList<>();
            tempNumbers.addAll(numbers);
            tempOperators.addAll(operators);

            for (int i = 0; i < orders[k].length; i++) {
                String cur = orders[k][i];

                for (int j = 0; j < tempOperators.size(); j++) {
                    if (cur.equals(tempOperators.get(j))) {
                        long num1 = tempNumbers.get(j);
                        long num2 = tempNumbers.get(j + 1);
                        tempNumbers.set(j, calculate(num1, num2, cur));
                        tempOperators.remove(j);
                        tempNumbers.remove(j + 1);
                    }
                }
            }
            if (tempNumbers.size() > 1) {
                long temp = Math
                    .abs(calculate(tempNumbers.get(0), tempNumbers.get(1), tempOperators.get(0)));
                result = Math.max(result, temp);
            } else {
                long temp = tempNumbers.get(0);
                result = Math.max(result, temp);
            }
        }
        return result;
    }

    public Long calculate(long num1, long num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String expression = "100-200*300-500+20";
        System.out.println(solution.solution(expression));
    }
}
