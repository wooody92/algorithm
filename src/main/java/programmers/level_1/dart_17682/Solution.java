package programmers.level_1.dart_17682;

public class Solution {

    public int solution(String dartResult) {
        char[] dartRecord = dartResult.toCharArray();
        int[] score = new int[3];
        int idx = -1;

        for (int i = 0; i < dartRecord.length; i++) {
            if (dartRecord[i] >= '0' && dartRecord[i] <= '9') {
                idx++;
                if (dartRecord[i] == '1' && dartRecord[i + 1] == '0') {
                    score[idx] = 10;
                    i++;
                    continue;
                }
                score[idx] = dartRecord[i] - '0';
                continue;
            }
            if (dartRecord[i] == 'D') {
                score[idx] = (int) Math.pow(score[idx], 2);
                continue;
            }
            if (dartRecord[i] == 'T') {
                score[idx] = (int) Math.pow(score[idx], 3);
                continue;
            }
            if (dartRecord[i] == '*') {
                score[idx] *= 2;
                if (idx != 0) {
                    score[idx - 1] *= 2;
                    continue;
                }
                continue;
            }
            if (dartRecord[i] == '#') {
                score[idx] *= -1;
                continue;
            }
        }
        return score[0] + score[1] + score[2];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("1D2S#10S"));
    }
}
