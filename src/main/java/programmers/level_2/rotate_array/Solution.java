package programmers.level_2.rotate_array;

import java.util.Arrays;

/**
 * 배열 회전 결과값 확인하기
 * 출처 : https://mr-dan.tistory.com/15
 */
public class Solution {

    public boolean solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
            rotateArray(arr1);
        }
        return false;
    }

    private int[] rotateArray(int[] array) {
        int first = array[0];
        for (int j = 0; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length - 1] = first;
        return array;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {3, 5, 7, 9};
        int[] arr2 = {7, 9, 3, 5};
        int[] arr3 = {3, 5, 7, 9};

        System.out.println(solution.solution(arr1, arr2));
    }
}
