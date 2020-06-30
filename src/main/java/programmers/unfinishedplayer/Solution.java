package programmers.unfinishedplayer;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i]))
                return participant[i];
        }

        return participant[completion.length];
    }

    public String solution2(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<>();
        int base = 0;

        for(int i=0; i<participant.length; i++){
            hm.put(participant[i], hm.getOrDefault(participant[i], base)+1);
        }
        for(int i=0; i<completion.length; i++){
            hm.put(completion[i], hm.getOrDefault(completion[i], base)-1);
        }

        for(String key : hm.keySet()){
            if(hm.get(key) != 0) {
                return key;
            }
        }
        return "";
    }

//    public static void main(String[] args) {
//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa", "marina"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola", "marina"};
//
//        Solution test = new Solution();
//        System.out.println(test.solution2(participant, completion));
//    }
}

