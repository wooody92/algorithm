package programmers.level_1.sweatsuit_42862;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n - lost.length;

        /**
         * 체육복 여분이 있으면서 도난당한 학생은 자신의 체육복을 입도록 필터링
         */
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        /**
         * 인접한 번호 학생이 갖고 있는지 확인 하도록 순회
         */
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] + 1 == reserve[j] || lost[i] - 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] lost = {2, 3};
        int[] reserve = {3, 4};
        System.out.println(solution.solution(5, lost, reserve));
    }
}


