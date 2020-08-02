package programmers.level_1.touch_keypad_67256;

public class Solution {

    /**
     * 로컬 테스트 시 log 결과값은 잘 나오는데 프로그래머스 테스트 시 결과값이 다르게 나와서 실패한다.
     * 현재 좌, 우 위치에서 목표 번호까지의 거리를 구하는 로직은 구글링으로 참고했다.
     */
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        String left = "L";
        String right = "R";
        int leftPosition = 10;
        int rightPosition = 12;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 11;
            }
            if (numbers[i] % 3 == 1) { // number[i] = 1, 3, 7
                sb.append(left);
                leftPosition = numbers[i];
                continue;
            }
            if (numbers[i] % 3 == 0) { // number[i] = 3, 6, 9
                sb.append(right);
                rightPosition = numbers[i];
                continue;
            }

            int leftDiff = Math.abs(leftPosition - numbers[i]);
            int rightDiff = Math.abs(rightPosition - numbers[i]);
            int leftDist = leftDiff / 3 + leftDiff % 3;
            int rightDist = rightDiff / 3 + rightDiff % 3;

            System.out.println(i + 1 + "번째 " + "number : " +numbers[i]);
            System.out.println(i + 1 + "번째 " + "leftPosition : " +leftPosition);
            System.out.println(i + 1 + "번째 " + "rightPosition : " +rightPosition);
            System.out.println(i + 1 + "번째 " + "leftDiff : " +leftDiff);
            System.out.println(i + 1 + "번째 " + "rightDiff : " +rightDiff);
            System.out.println(i + 1 + "번째 " + "leftDist : " +leftDist);
            System.out.println(i + 1 + "번째 " + "rightDist : " +rightDist);
            System.out.println("---------------------------------------");
            if (leftDist < rightDist) {
                sb.append(left);
                leftPosition = numbers[i];
                continue;
            }
            if (leftDist > rightDist) {
                sb.append(right);
                rightPosition = numbers[i];
                continue;
            }

            // 아래는 leftDist == rightDist 의 경우
            if (hand == "left") {
                sb.append(left);
                leftPosition = numbers[i];
                continue;
            }
            if (hand == "right") {
                sb.append(right);
                rightPosition = numbers[i];
                continue;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        System.out.println(solution.solution(numbers, hand));
    }
}
