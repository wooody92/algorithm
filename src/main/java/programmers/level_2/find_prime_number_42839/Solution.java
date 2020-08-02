package programmers.level_2.find_prime_number_42839;

import java.util.Arrays;

public class Solution {

    public int solution(String numbers) {
        int[] numberList = new int[numbers.length()];
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }
        System.out.println(Arrays.toString(numberList));

        int answer = 0;
        return answer;
    }

    // 사전순으로 순열 구하기
    // 사용 예시: perm(arr, output, visited, 0, n, 3);
    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }

    // 순열 구하기
    // 사용 예시: permutation(arr, 0, n, 4);
    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            print(arr, r);
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

    // 배열 출력
    static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        int[] output = new int[n];
        boolean[] visited = new boolean[n];
//        perm(arr, output, visited, 0, n, 3);
        permutation(arr, 0, n, 3);

//        Solution solution = new Solution();
//        String numbers = "011";
//        System.out.println(solution.solution(numbers));
    }
}
