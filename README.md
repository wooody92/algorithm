# algorithm
알고리즘 풀이 저장소

-----

## Backjoon

1. [13458 - 시험감독](https://www.acmicpc.net/problem/13458)

 - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/test_supervisor_13458/Main.java)
 - 주어지는 결과값이 int의 범위를 초과 할 수 있다.
 - 자료형 int -> long으로 변경 후 해결

2. [2309 - 일곱 난쟁이](https://www.acmicpc.net/problem/2309)

- [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/seven_dwarf_2309/Main.java)
- 난쟁이 7명 키의 합이 100이하가 아니고 100이다.

3. [1476 - 날짜 계산](https://www.acmicpc.net/problem/1476)

- [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/date_calculate_1476/Main.java)
- 최소공배수

4. [9095 - 1,2,3 더하기](https://www.acmicpc.net/problem/9095)

- [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/backjoon/add_one_two_three_9095/Main.java)
- 점화식
- DP
- Bottom-up & Top-down
- 배열 동적으로 초기화 시 런타임 에러 발생

5. [14501 - 퇴사](https://www.acmicpc.net/problem/14501)

- [Solution]
- DP
- 왜 틀린지 모르겠음. 다음에 다시풀어보기.

<br><br>

## Programmers

1. [42576 - 완주하지 못한 선수](https://programmers.co.kr/learn/courses/30/lessons/42576)

- [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/unfinishedplayer/Solution.java)

2. [42840 - 모의고사](https://programmers.co.kr/learn/courses/30/lessons/42840)

- [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/mock_exam/Solution.java)
- 확장성 없이 하드코딩 한 것 같다. 

3. [42862 - 체육복](https://programmers.co.kr/learn/courses/30/lessons/42862)

- [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/sweatsuit_42862/Solution.java)
- Greedy
- 그리디 사용은 잘 모르겠고, 전체 순회하여 조건으로 필터링하여 풀었다.

4. [42748 - k번째 수](https://programmers.co.kr/learn/courses/30/lessons/42748)

- [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/kth_number_42748/Solution.java)
- `Arrays.copyOfRange`, `Arrays.sort` 등 잘 사용하지 않았던 배열 관련 메서드들을 알게 되었다.

5. [12901 - 2016](https://programmers.co.kr/learn/courses/30/lessons/12901)

- [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/date_of_2016_12901/Solution.java)
- 나머지를 이용한 간단한 문제

6. [17681 - 비밀지도](https://programmers.co.kr/learn/courses/30/lessons/17681)

- [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/secret_map_kakao_17681/Solution.java)
- 주어진 길이 `n` 보다 2진수 자릿수가 적을 경우 0은 생략되기 때문에 가장 앞자리에 공백추가되지 않는 경우를 고려해야한다.
- `Integer.toBinaryString` 로 2진수로 변환 할 수 있다.
- `String.format` 로 자릿수와 타입 고정 할 수 있다.

7. [12906 - 같은 숫자는 싫어](https://programmers.co.kr/learn/courses/30/lessons/12906)

- [Solution]

8. [12903 - 가운데 글자 가져오기](https://programmers.co.kr/learn/courses/30/lessons/12903)

- [Solution]
- `String.subString` 내장함수로 간단하게 풀이 가능하다.

9. [12910 - 나누어 떨어지는 숫자 배열](https://programmers.co.kr/learn/courses/30/lessons/12910)

- [Solution]
- `for loop` 사용 : 코드가 길어지나, 속도가 빠르다.
- `Stream` 사용 : 직관적이고 코드가 간결하나, 속도가 느리다.
- 알고리즘 테스트에서는 어떤게 유리할까?

10. [12912 - 두 정수 사이의 합](https://programmers.co.kr/learn/courses/30/lessons/12912)

- [Solution]
- 일정 구간의 정수를 순차적으로 더하는 경우 가우스 공식을 사용하여 시간을 단축 시키도록 한다.
- `for loop` : `10ms` -> `Gauss` : `0.5ms`
- 간단한 알고리즘에도 수학공식을 적용하면 효율을 향상 시킬 수 있다는 것을 알게 되었다.

11. [12915 - 문자열 내 마음대로 정렬하기](https://programmers.co.kr/learn/courses/30/lessons/12915)

- [Solution]
- `Comparator Interface` 사용이 미숙하여 구글링 했다. 다시 풀어보기.
- `Arrays.sort()` 에 람다식으로 조건을 넣을 수 있다.
- `Comparator & Arrays.sort` 의 원리를 알아야 아래 내장 함수를 활용 할 수 있겠다.
- `Comparator - compareTo`, `Charactor.compare`

12. [12916 - 문자열 내 p와 y의 개수](https://programmers.co.kr/learn/courses/30/lessons/12916)

- [Solution]

13, [12917 - 문자열 내림차순으로 배치하기](https://programmers.co.kr/learn/courses/30/lessons/12917)

- [Solution]
- 문자열 sorting 시 `StringBuilder`를 사용하면 시간을 많이 단축 시킬 수 있다.

