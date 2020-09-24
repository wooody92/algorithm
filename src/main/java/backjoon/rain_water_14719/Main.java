package backjoon.rain_water_14719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        int[] map = new int[width];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < width; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int range = 0;
        for (int i = 0; i < width - 1; i++) {
            if (i != 0 && map[i] < map[i - 1]) {
                i--;
            }
            int temp = 0;
            for (int j = i + 1; j < width; j++) {
                if (map[i] <= map[j]) {
                    range = j;
                    temp = map[i];
                    break;
                }
                range = j;
                temp = map[j];
            }

            for (int j = i + 1; j < range; j++) {
                if (temp < map[j]) {
                    break;
                }
                sum += temp - map[j];
            }
            i = range;
        }
        System.out.println(sum);
    }
}
