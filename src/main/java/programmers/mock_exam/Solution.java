package programmers.mock_exam;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (student1[i%student1.length] == answers[i]) {
                count[0]++;
            }
            if (student2[i%student2.length] == answers[i]) {
                count[1]++;
            }
            if (student3[i%student3.length] == answers[i]) {
                count[2]++;
            }
        }

        int max = Math.max(Math.max(count[0], count[1]), count[2]);
        List<Integer> winner = new ArrayList<>();
        if (max == count[0]) {
            winner.add(1);
        }
        if (max == count[1]) {
            winner.add(2);
        }
        if (max == count[2]) {
            winner.add(3);
        }

        /**
         *
         * 사이즈 초기화 안해주면 바운더리 에러
         * 느리지만 아래와 같이 한줄로 처리 할 수 있다.
         */
        answer = new int[winner.size()];
        for (int i = 0; i < winner.size(); i++) {
            answer[i] = winner.get(i);
        }
        return answer;
        //        return winner.stream().mapToInt(i -> i.intValue()).toArray();

    }
}
