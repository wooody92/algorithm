package programmers.level_1.kth_number_42748;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            List<Integer> temp = new ArrayList<>();
            int first = commands[i][0] - 1;
            int last = commands[i][1] - 1;
            int k = commands[i][2] - 1;

            // last 범위까지 포함하여 리스트를 추가한다.
            for (int j = first; j <= last; j++) {
                temp.add(array[j]);
            }
            Collections.sort(temp);
            result.add(temp.get(k));
        }

        answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution kthNumber = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(kthNumber.solution(array, commands)));
    }

    /**
     *
     * 아래 처럼 Arrays.copyOfRange 사용하여 한줄로 처리 할 수도 있다.
     */
    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
