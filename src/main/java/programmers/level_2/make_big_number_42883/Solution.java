package programmers.level_2.make_big_number_42883;

public class Solution {

    /**
     * num[i]가 num[i+k]까지 비교하여 그중에 num[i]보다 큰 값이 있으면 num[i]는 result에 추가하지 않는다.
     */
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int[] num = new int[number.length()];

        int n = 0;
        for (String str : number.split("")) {
            num[n] = Integer.parseInt(str);
            n++;
        }

        for (int i = 0; i < num.length - k; i++) {
            boolean flag = false;
            for (int j = 1; j <= k; j++) {
                if (num[i] < num[i + j]) {
                    k--;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                sb.append(num[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String number = "4177252841";
        int k = 4;
        System.out.println(solution.solution(number, k));
    }
}
