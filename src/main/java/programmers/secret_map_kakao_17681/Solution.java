package programmers.secret_map_kakao_17681;

import java.util.Arrays;

public class Solution {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] | arr2[i];
            answer[i] = "";
            int count = 0;
            while (true) {
                answer[i] = (result[i] % 2 == 1 ? "#" : " ") + answer[i];
                count++;
                if (result[i] == 1) {
                    break;
                }
                result[i] = result[i] >> 1;
            }

            /**
             * 앞자리 생략 된 0의 공백을 추가해준다.
             */
            while (count != n) {
                answer[i] = " " + answer[i];
                count++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution secretMap = new Solution();
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(secretMap.solution(n, arr1, arr2)));
    }

    /**
     * Integer.toBinaryString 로 2인수 변환 할 수 있다.
     * String.format 로 String 자리수 고정 할 수 있다.
     */
    public String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }
        return result;
    }
}
