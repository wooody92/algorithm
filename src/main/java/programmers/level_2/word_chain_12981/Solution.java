package programmers.level_2.word_chain_12981;

public class Solution {

    /**
     * 1. 현재 단어 마지막 글자와 다음 단어 첫 글자 비교, 다음 단어가 null 인지 체크
     * 2. 현재 단어가 현재 인덱스 이전에 존재하는지 체크
     */
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        for (int i = 1; i < words.length; i++) {
            if (isNotEqualsChar(words[i - 1], words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            if (isContainWord(words, i)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }
        return answer;
    }

    public boolean isNotEqualsChar(String previousWord, String currentWord) {
        char lastChar = previousWord.charAt(previousWord.length() - 1);
        char firstChar = currentWord.charAt(0);
        if (lastChar != firstChar) {
            return true;
        }
        return false;
    }

    /**
     * 중복체크로 Set을 사용할 수 있었지만, 주어진 words 최대 길이가 100으로 매우 짧아 for 문으로 처리하였다.
     */
    public boolean isContainWord(String[] words, int idx) {
        for (int i = 0; i < idx; i++) {
            if (words[i].equals(words[idx])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int n = 3;
        System.out.println(solution.solution(n, words));
    }
}
