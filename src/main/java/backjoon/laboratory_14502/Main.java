package backjoon.laboratory_14502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // init
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int column = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int[][] map = new int[column][row];

        for (int i = 0; i < column; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < row; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // logic
        setWall(0, 0, map);

        // count safety area
        System.out.println(countSafety(map));
    }

    /**
     * back-tacking
     */
    public static void setWall(int start, int depth, int[][] map) {
        int column = map.length;
        int row = map[0].length;

        if (depth == 3) {
            // base case
            print(map);
            System.out.println();
            return;
        }

        for (int i = start; i < column * row; i++) {
            int x = i / row;
            int y = i % row;

            map[x][y] = 1;
            setWall(i + 1, depth + 1, map);
            map[x][y] = 0;
        }
    }

    /**
     * 0 : safety
     * 1 : wall
     * 2 : virus
     */
    public static int countSafety(int[][] map) {
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void print(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
