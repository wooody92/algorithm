package backjoon.add_one_two_three_9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     *
     * d[n] = d[n-1] + d[n-2] + d[n-3] (3 < n < 11)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < testCount; i++) {
            int number = Integer.parseInt(br.readLine());
            int[] d = new int[number]; // array 크기를 동적으로 초기화 시 runtime error로 11로 고정하여 통과
            d[0] = 1;
            d[1] = 2;
            d[2] = 4;
            for (int j = 3; j < number; j++) {
                d[j] = d[j-1] + d[j-2] + d[j-3];
            }
            result.add(d[number - 1]);
        }

        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));
        }
}
