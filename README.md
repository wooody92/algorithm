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
- `String` 문자열 로직 처리 시 (`Sorting` 등) `StringBuilder`를 사용하면 시간을 많이 단축 시킬 수 있다.

14. [12918 - 문자열 다루기 기본](https://programmers.co.kr/learn/courses/30/lessons/12918)

- [Solution]
- `ASCII code`를 이용하여 풀었다.
- `char`는 `int` 형 변환 하면 `ascii code`를 확인 할 수 있다.
- 정규식으로 푸는 방법도 있다.

15. [12919 - 서울에서 김서방 찾기](https://programmers.co.kr/learn/courses/30/lessons/12919)

- [Solution]

16. [12921 - 소수 찾기](https://programmers.co.kr/learn/courses/30/lessons/12921)

- [Solution]
- 주어진 수 `N` 보다 작은 소수로만 나누는 조건으로 했을 경우 효율성 검사에서 실패했다.
- 구글링으로 아래 수학적 조건을 이용하여 효율성 검사를 통과하였다. 수학적 지식이 없었으면 효율성에서 계속 떨어졌을 것 같다.
- 주어진 수 `N`이 `2`부터 `N 제곱근` 범위에서 나누었을 때 `0`이 되는 수가 있다면, 그 수는 소수가 아니다. 즉, 이 범위내 나누어지는 수가 없다면 그 수는 소수이다.

17. [12922 - 수박수박수박수박수박수?](https://programmers.co.kr/learn/courses/30/lessons/12922)

- [Solution]
- `String vs. StringBuffer vs. StringBuilder` 차이점 복습
- `String` :`Immutable` 불변성, 힙 영역에 생성되고 (GB가 동작하는 영역),한번 생성되면 할당 된 메모리 공간이 변하지않고, 추가한 만큼 객체가 생성된다.
- `StringBuffer` : `Mutable`, 멀티 스레드 환경에서 동기화를 지원한다. 스레드에 안전한 프로그램이 필요할 때 사용한다.
- `StringBuilder` : `Mutable`, 단일 스레드 환경에서 사용하고, 동기화를 보장하지 않는다. 연산이 많을 경우 가장 성능이 좋다.
- 알고리즘에서 `String` 문자열 로직 처리 시 `StringBuilder`를 사용하도록 하자. 

18. [12925 - 문자열을 정수로 바꾸기](https://programmers.co.kr/learn/courses/30/lessons/12925)

- [Solution]

