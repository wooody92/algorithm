package reference.stock;

public class Solution {

    public int solution(int[] stock) {
        int maxProfit = 0;
        int minPrice = stock[0];

        for (int i = 1; i < stock.length; i++) {
            int profit = stock[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (stock[i] < minPrice) {
                minPrice = stock[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] stock = {9800, 8200, 7800, 8300, 9500, 9800, 10200, 9500};
        System.out.println(solution.solution(stock));
    }
}
