package backjoon.robotic_vacuum_14503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 이동 방향 : 북 동 남 서
    static int dx[] = {0, -1, 0, 1};
    static int dy[] = {-1, 0, 1, 0};


    public static void main(String[] args) throws IOException {
        // init
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // array size
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];

        // x, y coordinate & direction
        st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        int direction = Integer.parseInt(st.nextToken());

        // array map
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // logic
        map = cleanMap(column, row, direction, map);
        System.out.println(countCleanArea(map));
        printMap(map);
    }

    public static int[][] cleanMap(int x, int y, int direction, int[][] map) {
        int N = map.length;
        int M = map[0].length;
        map[y][x] = 2;

        printMap(map);
        System.out.println("========= " + direction + " =========");
        System.out.println(">> x : " + x + " >> y : " +y);
        System.out.println("=============================");

        for (int i = direction; i < direction + 4; i++) {
            int idx = i % 4;

            int nx = x + dx[idx];
            int ny = y + dy[idx];

            if (nx >= 0 && nx < M && ny >=0 && ny < N) {
                if (map[ny][nx] == 0) {
                    map[ny][nx] = 2;
                    direction = getLeftDirection(idx);

                    // 후진 및 종료 조건이 들어가야 한다.
                    // 완전탐색으로 푸는 문제가 맞는걸까 하는 의문이 들어온다.

                    cleanMap(nx, ny, direction, map);
                }
            }
        }
        return map;
    }

    public static int getLeftDirection(int direction) {
        if (direction == 4) {
            return 0;
        }
        return direction + 1;
    }

    public static int countCleanArea(int[][] map) {
        int N = map.length;
        int M = map[0].length;
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 2) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void printMap(int[][] map) {
        int N = map.length;
        int M = map[0].length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
