## Backjoon

1. [13458 - 시험감독](https://www.acmicpc.net/problem/13458)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/test_supervisor_13458/Main.java)
   - 주어지는 결과값이 int의 범위를 초과 할 수 있다.
   - 자료형 `int` -> `long`으로 변경 후 해결

2. [2309 - 일곱 난쟁이](https://www.acmicpc.net/problem/2309)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/seven_dwarf_2309/Main.java)
   - 난쟁이 7명 키의 합이 100이하가 아니고 100이다.

3. [1476 - 날짜 계산](https://www.acmicpc.net/problem/1476)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/date_calculate_1476/Main.java)
   - 최소공배수

4. [9095 - 1,2,3 더하기](https://www.acmicpc.net/problem/9095)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/add_one_two_three_9095/Main.java)
   - `점화식`
   - `DP`
   - `Bottom-up` & `Top-down`
   - 배열 동적으로 초기화 시 런타임 에러 발생

5. [14501 - 퇴사](https://www.acmicpc.net/problem/14501)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/resignation_14501/Main.java)
   - `DP`
   - 왜 틀린지 모르겠음. 다음에 다시풀어보기.

6. [14889 - 스타트와 링크](https://www.acmicpc.net/problem/14889)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/start_link_14889/Main.java)

   - 조합을 이용하여 푸는 문제이다. 이를 이용하려면 재귀와 백트래킹에 대해 학습해야 한다.

   - 풀이 방식이 정리가 안돼서 아래 블로그를 참고하여 해결하였다.

     https://bcp0109.tistory.com/30
   
7. [14888 - 연산자 끼워넣기](https://www.acmicpc.net/problem/14888)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/add_operator_14888/Main.java)

   - 연산자의 경우의 수를 순열(`permutation`)로 모두 구한 후 계산하여 풀이하였다. 

   - 테스트에는 통과하였지만 나의 풀이 경우에는 같은 연산자가 여러번 반복되면 그만큼 중복되어 계산하여 시간복잡도가 올라간다.

   - 다른 사람의 풀이를 보니 다음과 같은 방식으로 시간복잡도를 줄였다.

     ```java
     // 1. 연산자를 갯수를 int로 받아서 그대로 사용한다.
     st = new StringTokenizer(br.readLine());
     for (int i = 0; i < 4; i++) {
       operator[i] = Integer.parseInt(st.nextToken());
     }
     
     // 2. 순열이 아닌 DFS 백트래킹을 이용하여 해결하였다.
     https://www.acmicpc.net/source/21639755
     https://zoonvivor.tistory.com/98
     https://brenden.tistory.com/18
     ```

   - 완전탐색(`DFS`, `BFS`, `Backtracking`, `permutation` 등)과 그 방법들의 관계에 대해서 명확하게 이해가 필요하다.

8. [14502 - 연구소](https://www.acmicpc.net/problem/14502)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/laboratory_14502/Main.java)
   - 완전탐색 `DFS` 문제임을 파악하지 못했다. 백트래킹과 좌표계 탐색을 학습하기 좋은 문제여서 학습 후 정리했다.
   - [https://wooody92.github.io/algorithm/Algorithm-backtracking/](https://wooody92.github.io/algorithm/Algorithm-%EC%99%84%EC%A0%84%ED%83%90%EC%83%89/)

9. [14503 - 로봇 청소기](https://www.acmicpc.net/problem/14503)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/robotic_vacuum_14503/Main.java)
   - 방향을 바꾸면서 완전 탐색하는 방식까지 구현했는데, 후진 및 종료조건의 경우를 구현하지 못해 구글을 참고하여 풀었다.
   - 완전탐색이 아닌 `DFS`를 학습하기 좋은 문제라고 생각하여 블로그에 고민했던 점들을 정리하였다.
   - [https://wooody92.github.io/algorithm/Algorithm-DFS/](https://wooody92.github.io/algorithm/Algorithm-DFS/)
   
10. [14719 - 빗물](https://www.acmicpc.net/status?user_id=skyskysky0&problem_id=14719&from_mine=1)

    - [Solution] 재도전 하기

    - 예외 케이스를 통과하지 못해 코드를 수정하다보니 꼬였다.

    - 예외 테스트 케이스

      ```java
      // #1
      9 5
      9 8 7 6 5
      
      // #2
      5 5
      5 5 4 5 5
        
      // #3
      5 5
      3 5 3 4 3
      ```

11. [2504 - 괄호의 값](https://www.acmicpc.net/problem/2504)

    - [Solution]
    
    
    
12. [1260 - DFS와 BFS](https://www.acmicpc.net/problem/1260)

    - [Solution]
    - DFS와 BFS의 기본 동작원리를 연습하는 좋은 문제였다.
    - [https://wooody92.github.io/algorithm/Algorithm-BFS%EC%99%80-DFS/](https://wooody92.github.io/algorithm/Algorithm-BFS%EC%99%80-DFS/)

13. [1254 - 팰린드롬 만들기](https://www.acmicpc.net/problem/1254)

    - [Solution]
    - 팰린드롬인지 확인하는 메서드, 문자열을 뒤집는 메서드, 뒤집은 문자열을 기존 문자열에 붙이는 메서드를 이용하여 풀이하였다.
    - [참고링크](https://m.blog.naver.com/PostView.nhn?blogId=occidere&logNo=221190032874&proxyReferer=https:%2F%2Fwww.google.com%2F)
