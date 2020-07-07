package programmers.puppeteer_64061;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> bucket = new ArrayList<>();
        bucket.add(-1);

        for (int i = 0; i < moves.length; i++) {
            int move = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                int target = board[j][move];
                int lastIndexOfBucket = bucket.size() - 1;
                if (target != 0) {
                    board[j][move] = 0;
                    if (target == bucket.get(lastIndexOfBucket)) {
                        bucket.remove(lastIndexOfBucket);
                        answer += 2;
                        break;
                    }
                    bucket.add(target);
                    break;
                }
            }
        }
        System.out.println(bucket);
        return answer;
    }

    /**
     * 동일한 코드를 Stack 구조를 이용하여 풀 수 있다.
     */
    public int solution2(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<>();
        bucket.push(-1);

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                int target = board[j][move - 1];
                if (target != 0) {
                    board[j][move - 1] = 0;
                    if (target == bucket.peek()) {
                        bucket.pop();
                        answer += 2;
                        break;
                    }
                    bucket.push(target);
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution.solution2(board, moves));
    }
}
