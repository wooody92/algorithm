package programmers.level_2.prime_number_42839;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    static Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int[] number = Arrays.stream(numbers.split("")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int n = number.length;

        for (int i = 1; i <= number.length; i++) {
            permutation(number, 0, n, i);
        }

        int result = 0;
        while (set.size() > 0) {
            int num = set.iterator().next();
            if (isPrime(num)) {
                result++;
            }
            set.remove(num);
        }
        return result;
    }

    // 순열 구하기
    // 사용 예시: permutation(arr, 0, n, 4);
    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            makeSet(arr, r);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    static void makeSet(int[] arr, int r) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            sb.append(arr[i]);
        }
        set.add(Integer.parseInt(sb.toString()));
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String numbers = "011";
        System.out.println(solution.solution(numbers));
    }
}
