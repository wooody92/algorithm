package programmers.level_2.candidate_key_42890;

public class Solution {

    /**
     * bitmask
     */
    public int solution(String[][] relation) {
        int count = 0;
        for (int i = 0; i < relation.length; i++) {
        }

        return 0;
    }

    public boolean isUnique(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
