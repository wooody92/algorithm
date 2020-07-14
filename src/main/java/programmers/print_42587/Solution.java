package programmers.print_42587;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 * bucket size가 1인 경우도 고려해서 작성해야 루프에 빠지지 않는다.
 * flag를 쓰지않고 bucket size를 이용하여 루프를 종료 시킬 수 있다.
 */
public class Solution {

    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> bucket = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            bucket.add(priorities[i]);
        }

        while (!bucket.isEmpty()) {
            for (int i = 0; i < bucket.size(); i++) {
                if (bucket.get(0) < bucket.get(i)) {
                    bucket.add(bucket.get(0));
                    bucket.remove(0);
                    break;
                }
                if (i == bucket.size() - 1 || bucket.size() == 1) {
                    bucket.remove(0);
                    answer++;
                    if (location == 0) {
                        return answer;
                    }
                    break;
                }
            }
            location--;
            if (location < 0) {
                location = bucket.size() - 1;
            }
        }
        return answer;
    }

    /**
     * Deque를 이용한 풀이법
     */
    public int solution2(int[] priorities, int location) {
        int answer = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i : priorities) {
            deque.add(i);
        }
        Arrays.sort(priorities);
        int size = priorities.length - 1;

        while (!deque.isEmpty()) {
            Integer i = deque.poll();
            if (i == priorities[size - answer]) {
                answer++;
                location--;
                if (location < 0) {
                    return answer;
                }
                continue;
            }
            deque.add(i);
            location--;
            if (location < 0) {
                location = deque.size() - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] priorities = {3, 3, 4, 2};
        int location = 3;
        System.out.println(solution.solution(priorities, location));
    }
}
