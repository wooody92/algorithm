package reference.dfs;

public class Solution2 {

    int result = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);
        return result;
    }

    public void dfs(int[] numbers, int depth, int sum, int target) {
        if (depth == numbers.length) {
            if (sum == target) {
                result++;
            }
            return;
        }
        dfs(numbers, depth + 1, sum + numbers[depth], target);
        dfs(numbers, depth + 1, sum - numbers[depth], target);
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution.solution(numbers, target));
    }
}
