package programmers.level_2.scoville_42626;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

    /**
     * priorityQueue 사용
     * O(n) : n log n
     */
    public int solution(int[] scovilles, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (Integer scoville : scovilles) {
            q.add(scoville);
        }
        int count = 0;
        while (q.size() > 1) {
            if (q.peek() > k) {
                return count;
            }
            int first = q.poll();
            int second = q.poll();
            int mix = mix(first, second);
            q.add(mix);
            count++;
        }
        return q.peek() > k ? count : -1;
    }

    /**
     * ArrayList - Collections.sort 사용
     * O(n) : n^2 ?
     */
    public int solution2(int[] scovilles, int k) {
        List<Integer> list = new ArrayList<>();
        for (Integer scoville : scovilles) {
            list.add(scoville);
        }

        int count = 0;
        while (list.size() > 1) {
            Collections.sort(list);
            if (list.get(0) > k) {
                return count;
            }
            int mix = mix(list.get(0), list.get(1));
            list.set(1, mix);
            list.remove(0);
            count++;
        }
        return list.get(0) > k ? count : -1;
    }

    private int mix(int num1, int num2) {
        return num1 + (num2 * 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] socoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(solution.solution(socoville, k));
    }
}
