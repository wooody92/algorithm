package programmers.level_2.joystick_42860;

import java.util.HashMap;

public class Solution {

    /**
     * 다시 풀어보기
     * 우로 이동하다 다시 좌로 이동 할 수 있다.
     * 좌로 이동하다 다시 우로 이동 할 수 있을까?
     * 굳이 해쉬없이 ascii로 문자 처리 가능
     */
    public int solution(String name) {
        String[] alphabet = {"A",
            "B", "C",
            "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M",
            "N",
            "O", "P", "Q", "R", "S",
            "T", "U", "V", "W", "X",
            "Y", "Z"};
        HashMap<String, Integer> moveCount = new HashMap<>();
        for (int i = 0; i < alphabet.length; i++) {
            if (i <= 13) {
                moveCount.put(alphabet[i], i);
                continue;
            }
            moveCount.put(alphabet[i], alphabet.length - i);
        }

        String[] letter = name.split("");
        int totalCount = 0;
        for (int i = 0; i < letter.length; i++) {
            totalCount += moveCount.get(letter[i]);
        }

        int minMove = letter.length - 1;
        for (int i = 0; i < letter.length; i++) {
            if (!letter[i].equals("A")) {
                int next = i + 1;
                while (next < letter.length && letter[i].equals("A")) {
                    next++;
                }
                int move = 2 * i + letter.length - next;
                minMove = Math.min(move, minMove);
            }
        }

        return totalCount + minMove;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] testCase = {"BBABA", "BBBAAB", "BBAABAA", "BBAABBB", "BBAABAAAA", "BBAABAAAAB",
            "BBBBAAAABA", "JEROEN", "JAN"};
        int[] answer = {6, 8, 7, 10, 7, 10, 12, 56, 23};
        for (int i = 0; i < testCase.length; i++) {
            System.out.println("------");
            System.out.println("my : " + solution.solution(testCase[i]));
            System.out.println("expected : " + answer[i]);
        }
    }
}
