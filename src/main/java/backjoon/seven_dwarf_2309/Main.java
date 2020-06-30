package backjoon.seven_dwarf_2309;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] height = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            height[i] = sc.nextInt();
            sum += height[i];
        }

        for (int i = 0; i < 9; i++) {
            sum -= height[i];
            for (int j = i + 1; j < 9; j++) {
                sum -= height[j];
                if (sum == 100) {
                    height[i] = 0;
                    height[j] = 0;
                    break;
                }
                sum += height[j];
            }
            sum += height[i];
            if (sum == 100) {
                break;
            }
        }

        Arrays.sort(height);
        for (int i = 2; i < 9; i++) {
            System.out.println(height[i]);
        }
    }
}
