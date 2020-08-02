package programmers.camouflage_42578;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Solution {

    /**
     * Hash 기능을 이용하여 개선한 코드
     */
    public int solution(String[][] clothes) {
        HashMap<String, Integer> cloth = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            int cnt = 1;
            if (cloth.containsKey(clothes[i][1])) {
                cnt = cloth.get(clothes[i][1]) + 1;
            }
            cloth.put(clothes[i][1], cnt);
        }

        Iterator<Integer> iter = cloth.values().iterator();
        int answer = 1;
        while (iter.hasNext()) {
            answer *= (iter.next().intValue() + 1);
        }
        return answer - 1;
    }

    /**
     * 기존 나의 풀이
     * Hash 기능을 사용하지 않고 배열스럽게 풀었다.
     */
    public int solution2(String[][] clothes) {
        HashMap<String, Integer> cloth = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            int cnt = 0;
            for (int j = 0; j < clothes.length; j++) {
                if (clothes[i][1].equals(clothes[j][1])) {
                    cnt++;
                }
            }
            cloth.put(clothes[i][1], cnt);
        }

        Iterator<Integer> iter = cloth.values().iterator();
        int answer = 1;
        while (iter.hasNext()) {
            answer *= (iter.next().intValue() + 1);
        }
        return answer - 1;
    }

    /**
     * 다른 사람의 풀이
     * 함수형으로 처리 할 수도 있다.
     */
    public int solution3(String[][] clothes) {
        return Arrays.stream(clothes)
            .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
            .values()
            .stream()
            .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution.solution(clothes));
    }
}
