package programmers.level_2.life_boat_42885;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    /**
     * Array의 index만 사용하여 풀었다. ArrayList를 사용할 때보다 시간이 확연히 단축되었다.
     */
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int lifeBoat = 0;
        int firstIndex = 0;
        for (int lastIndex = people.length - 1; lastIndex >= firstIndex; lastIndex--) {
            if (people[firstIndex] + people[lastIndex] > limit) {
                lifeBoat++;
                continue;
            }
            firstIndex++;
            lifeBoat++;
        }
        return lifeBoat;
    }

    /**
     * ArrayList를 이용하여 풀었으나, 효율성 테스트 중 하나를 통과하지 못했다.
     * Collection을 사용해서 시간이 초과된 것으로 판단된다.
     */
    public int solution2(int[] people, int limit) {
        List<Integer> peopleList = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            peopleList.add(people[i]);
        }
        Collections.sort(peopleList);

        int lifeBoat = 0;
        while (!peopleList.isEmpty()) {
            int lastIndex = peopleList.size() - 1;
            if (peopleList.size() == 1) {
                lifeBoat++;
                break;
            }
            if (peopleList.get(0) + peopleList.get(lastIndex) > limit) {
                peopleList.remove(lastIndex);
                lifeBoat++;
                continue;
            }
            for (int i = 0; i < peopleList.size(); i++) {
                if (peopleList.get(i) + peopleList.get(lastIndex) <= limit) {
                    peopleList.remove(lastIndex);
                    peopleList.remove(i);
                    lifeBoat++;
                    break;
                }
            }
        }
        return lifeBoat;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] people = {40, 40, 40};
        int limit = 100;
        System.out.println(solution.solution(people, limit));
    }
}
