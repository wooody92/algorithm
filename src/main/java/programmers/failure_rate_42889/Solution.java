package programmers.failure_rate_42889;

import java.util.Arrays;
import java.util.Collections;

/**
 * stage에 도달한 player가 없을 경우 실패율은 0으로 처리한다.
 * 통과는 했지만 복잡도를 낮춰야 할 것 같다.
 */
public class Solution {

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Double[] failure = new Double[N];

        for (int i = 0; i < N; i++) {
            double playersOnStage = 0;
            double players = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i + 1) {
                    players++;
                }
                if (stages[j] == i + 1) {
                    playersOnStage++;
                }
            }
            if (players == 0) {
                failure[i] = 0d;
                continue;
            }
            failure[i] = playersOnStage / players;
        }
        Double[] sortedFailure = failure.clone();
        Arrays.sort(sortedFailure, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < failure.length; j++) {
                if (sortedFailure[i] == failure[j]) {
                    answer[i] = j + 1;
                    failure[j] = -1d;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 9;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution.solution(N, stages)));
        // 3,4,2,1,5
    }
}
