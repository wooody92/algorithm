package backjoon.robotic_vacuum_14503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // direction : N E S W
    static int dx[] = {0, 1, 0, -1};
    static int dy[] = {-1, 0, 1, 0};
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        // init
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // array size
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
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

        // start cleaning
        map = dfs(column, row, direction, map);
        System.out.println(countCleanArea(map));
    }

    /**
     * cleaning the map
     * 1. 모든 방향을 확인하며 청소 가능한 방향을 탐색 후 dfs 재귀 호출
     * 2. 모든 방향의 청소가 끝났다면 후진
     * 3. 후진이 불가능하면 종료
     */
    public static int[][] dfs(int x, int y, int direction, int[][] map) {
        map[y][x] = 2;
        printMap(map);

        for (int i = 0; i < 4; i++) {
            // make current direction left
            direction = (direction + 3) % 4;
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                if (map[ny][nx] == 0) {
                    map[ny][nx] = 2;
                    dfs(nx, ny, direction, map);
                    // 완전 탐색을 하면 안되기 때문에 해당 조건을 추가한다.
                    // return 하지 않으면 로봇이 탐색하지 않은 영역으로 순간이동한다.
                    return map;
                }
            }
        }

        // 모든 방향의 청소가 끝났다면 후진
        // make current direction back
        int back = (direction + 2) % 4;
        int nx = x + dx[back];
        int ny = y + dy[back];
        if (nx >= 0 && nx < M && ny >=0 && ny < N) {
            if (map[ny][nx] != 1) {
                dfs(nx, ny, direction, map);
            }
        }
        // 모든 방향의 청소가 끝나고 후진이 불가하면 종료
        return map;
    }

    public static int countCleanArea(int[][] map) {
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
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("========================");
    }
}
