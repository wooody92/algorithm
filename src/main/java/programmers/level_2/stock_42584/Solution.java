package programmers.level_2.stock_42584;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * 주어진 데이터를 조회만 하면 되므로 배열로만 처리하여 효율성 테스트를 통과하였다.
     */
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < answer.length; i++) {
            int count = 0;
            int price = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if (price > prices[j]) {
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    public int[] solution2(int[] prices) {
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
