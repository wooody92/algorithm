package programmers.level_2.open_chat_42888;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public String[] solution(String[] record) {
        final String ENTER = "Enter";
        final String LEAVE = "Leave";
        HashMap<String, String> nickName = new HashMap<>();
        List<String> id = new ArrayList<>();
        List<String> enterStatus = new ArrayList<>();

        for (int i = 0; i < record.length; i++) {
            String[] temp = record[i].split(" ");
            if (record[i].startsWith(ENTER)) {
                nickName.put(temp[1], temp[2]);
                id.add(temp[1]);
                enterStatus.add("님이 들어왔습니다.");
                continue;
            }
            if (record[i].startsWith(LEAVE)) {
                id.add(temp[1]);
                enterStatus.add("님이 나갔습니다.");
                continue;
            }
            nickName.put(temp[1], temp[2]);
        }

        String[] answer = new String[enterStatus.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = nickName.get(id.get(i)) + enterStatus.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(solution.solution(record));
    }
}
