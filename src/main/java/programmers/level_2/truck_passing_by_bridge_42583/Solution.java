package programmers.level_2.truck_passing_by_bridge_42583;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        int answer = 0;
        Deque<Integer> trucks = new ArrayDeque<>();
        Deque<Integer> waitingTrucks = new ArrayDeque<>();

        for (int truckWeight : truckWeights) {
            trucks.offer(truckWeight);
        }

        while (!trucks.isEmpty()) {
            waitingTrucks.offer(trucks.peek());

            answer++;
        }

        return answer;
    }
}
