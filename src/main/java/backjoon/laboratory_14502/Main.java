package backjoon.laboratory_14502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static List<Point> virusList = new ArrayList<Point>();
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int max = 0;

    /**
     * 0 : safety
     * 1 : wall
     * 2 : virus
     */
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
                if (map[i][j] == 2) {
                    virusList.add(new Point(i, j));
                }
            }
        }

        // logic
        setWall(0, 0, map);

        // print max value of safety area : 0
        System.out.println(max);
    }

    /**
     * 완전 탐색 main logic
     */
    public static void setWall(int start, int depth, int[][] map) {
        int column = map.length;
        int row = map[0].length;

        // base case
        if (depth == 3) {
            // wall이 세워지고, virus 퍼지기 전 상태의 map 복사한다.
            int[][] copyMap = copyMap(map);

            // virus : 2가 있는 좌표를 순회하며 virust 퍼트린다.
            for (Point point : virusList) {
                copyMap = spreadVirus(point.x, point.y, copyMap);
            }

            // virus 퍼진 맵의 safety 갯수의 max 값만 저장한다.
            max = Math.max(max, countSafety(copyMap));

            // 전과 후 비교를 위한 print
            print(map);
            System.out.println();
            print(copyMap);
            System.out.println("==========");
            return;
        }

        // back-tracking
        for (int i = start; i < column * row; i++) {
            int x = i / row;
            int y = i % row;

            if (map[x][y] == 0) {
                map[x][y] = 1;
                setWall(i + 1, depth + 1, map);
                map[x][y] = 0;
            }
        }
    }

    // DFS
    public static int[][] spreadVirus(int x, int y, int[][] map) {
        int column = map.length;
        int row = map[0].length;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 좌표가 정의된 배열의 범위 안의 경우만 탐색한다.
            if (0 <= nx && nx < column && 0 <= ny && ny < row) {
                if (map[nx][ny] == 0) {
                    map[nx][ny] = 2;
                    spreadVirus(nx, ny, map);
                }
            }
        }
        return map;
    }

    public static int[][] copyMap(int[][] map) {
        int[][] copyMap = new int[map.length][];
        for (int i = 0; i < map.length; i++) {
            copyMap[i] = map[i].clone();
        }
        return copyMap;
    }

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
