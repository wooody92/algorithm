package reference.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

    static int[][] map; // 0으로 초기화
    static boolean[] visited;
    static int N; // 정점 갯수
    static int M; // 간선 갯수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int startingPoint = Integer.parseInt(st.nextToken()); // 시작 정점

        // 의미상 편리성을 위해 0번은 사용하지 않는다.
        map = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        // map에 간선으로 연결되어 있는 정점 관계를 1로 마킹
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            map[start][end] = 1;
            map[end][start] = 1;
        }
        bfs(startingPoint);
    }

    static void bfs(int point) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(point);
        visited[point] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.print(x + " ");

            // map을 순회하며 간선을 확인 후 연결되어 있는 정점을 queue에 입력하고 visited 마킹
            for (int i = 1; i <= N; i++) {
                if (map[x][i] == 1 && visited[i] == false) {
                    queue.offer(i);
                    visited[i] = true; // 이미 방문한 정점은 다시 queue에 넣지 않기 위해 마킹한다.
                }
            }
        }
    }
}
