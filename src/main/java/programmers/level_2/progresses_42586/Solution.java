package programmers.level_2.progresses_42586;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int[] progresses, int[] speeds) {
        int[] workingTime = new int[progresses.length];
        List<Integer> result = new ArrayList<>();

        /**
         * 남은 일수 계산
         */
        for (int i = 0; i < workingTime.length; i++) {
            int time = (100 - progresses[i]) / speeds[i];
            workingTime[i] = (100 - progresses[i]) % speeds[i] == 0 ? time : time + 1;
        }

        /**
         * 현재 인덱스로부터 큰 값이 나올때까지 카운트 한다.
         * 현재 인덱스보다 큰 값이 나오지 않을 경우(남은 일 수가 모두 같은 경우)를 고려하여 조건을 추가한다.
         * i = j - 1하여 불필요한 연산을 줄였다.
         */
        for (int i = 0; i < workingTime.length; i++) {
            int cnt = 0;
            for (int j = i; j < workingTime.length; j++) {
                cnt++;
                if (workingTime[i] < workingTime[j]) {
                    result.add(cnt - 1);
                    i = j - 1;
                    break;
                }
                if (j == workingTime.length - 1) {
                    result.add(cnt);
                    i = j;
                    break;
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses = {5, 5, 5};
        int[] speeds = {21, 25, 20};
        System.out.println(Arrays.toString(solution.solution(progresses, speeds)));
    }
}
