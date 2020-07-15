package programmers.stock_42584;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int[] prices) {
        List<Integer> stock = new ArrayList<>();
        int[] answer = new int[prices.length];
        for (Integer price : prices) {
            stock.add(price);
        }

        for (int i = 0; i < answer.length; i++) {
            int price = stock.get(0);
            int count = 0;
            for (int j = 0; j < stock.size(); j++) {
                count++;
                if (price > stock.get(j)) {
                    break;
                }
            }
            stock.remove(0);
            answer[i] = count - 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution.solution(prices)));
    }
}
