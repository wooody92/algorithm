package programmers.touch_keypad_67256;

import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * 손이 중앙으로 갈 수 있는 걸 고려해야 한다.
     */
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        String left = "L";
        String right = "R";
        int leftPosition = 10; // '*'
        int rightPosition = 12; // '#'
        hand = hand == "left" ? left : right;

        List<Integer> bucket = Arrays.asList(2, 5, 8, 11);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "루프 입력값 : " + numbers[i]);
            System.out.println("left position : " + leftPosition);
            System.out.println("right position : " + rightPosition);

            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append(left);
                leftPosition = numbers[i];
                System.out.println("--------------------------");
                continue;
            }
            if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                sb.append(right);
                rightPosition = numbers[i];
                System.out.println("--------------------------");
                continue;
            }

            if (numbers[i] == 0) {
                numbers[i] = 11;
            }

            if (bucket.indexOf(leftPosition + 1) == bucket.indexOf(rightPosition - 1)) {
                sb.append(hand);
                if (hand == left) {
                    leftPosition = numbers[i];
                } else {
                    rightPosition = numbers[i];
                }
                System.out.println("--------------------------");
                continue;
            }

            System.out.println(i + "번째 number : " + numbers[i]);
            System.out.println(i + "번째 left bucket : " + (leftPosition + 1));
            System.out.println(i + "번째 right bucket : " + (rightPosition - 1));
            System.out.println(i + "번째 left bucket 절대값 : " + Math.abs(numbers[i] - (leftPosition + 1)));
            System.out.println(i + "번째 right bucket 절대값 : " + Math.abs(numbers[i] - (rightPosition - 1)));
            String result = Math.abs(numbers[i] - (leftPosition + 1)) < Math.abs(numbers[i] - (rightPosition - 1)) ? left : right;
            System.out.println(" 결과 >>> " +result);
            sb.append(result);
            if (result == left) {
                leftPosition = numbers[i];
            } else {
                rightPosition = numbers[i];
            }

            System.out.println("--------------------------");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        System.out.println(solution.solution(numbers, hand));
    }
}
