## Programmers

#### LEVEL 1

1. [42576 - 완주하지 못한 선수](https://programmers.co.kr/learn/courses/30/lessons/42576)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/unfinished_player_42576/Solution.java)

2. [42840 - 모의고사](https://programmers.co.kr/learn/courses/30/lessons/42840)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/mock_exam_42840/Solution.java)
   - 확장성 없이 하드코딩 한 것 같다. 

3. [42862 - 체육복](https://programmers.co.kr/learn/courses/30/lessons/42862)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/sweatsuit_42862/Solution.java)
   - Greedy
   - 그리디 사용은 잘 모르겠고, 전체 순회하여 조건으로 필터링하여 풀었다.

4. [42748 - k번째 수](https://programmers.co.kr/learn/courses/30/lessons/42748)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/kth_number_42748/Solution.java)
   - `Arrays.copyOfRange`, `Arrays.sort` 등 잘 사용하지 않았던 배열 관련 메서드들을 알게 되었다.

5. [12901 - 2016](https://programmers.co.kr/learn/courses/30/lessons/12901)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/date_of_2016_12901/Solution.java)
   - 나머지를 이용한 간단한 문제

6. [17681 - 비밀지도 : kakao 2018](https://programmers.co.kr/learn/courses/30/lessons/17681)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/secret_map_kakao_17681/Solution.java)
   - 주어진 길이 `n` 보다 2진수 자릿수가 적을 경우 0은 생략되기 때문에 가장 앞자리에 공백추가되지 않는 경우를 고려해야한다.
   - `Integer.toBinaryString` 로 2진수로 변환 할 수 있다.
   - `String.format` 로 자릿수와 타입 고정 할 수 있다.

7. [12906 - 같은 숫자는 싫어](https://programmers.co.kr/learn/courses/30/lessons/12906)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/number_compression_12906/Solution.java)

8. [12903 - 가운데 글자 가져오기](https://programmers.co.kr/learn/courses/30/lessons/12903)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/get_center_string_12903/Solution.java)
   - `String.subString` 내장함수로 간단하게 풀이 가능하다.

9. [12910 - 나누어 떨어지는 숫자 배열](https://programmers.co.kr/learn/courses/30/lessons/12910)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/divisor_array_12910/Solution.java)
   - `for loop` 사용 : 코드가 길어지나, 속도가 빠르다.
   - `Stream` 사용 : 직관적이고 코드가 간결하나, 속도가 느리다.
   - 알고리즘 테스트에서는 어떤게 유리할까? `for loop`

10. [12912 - 두 정수 사이의 합](https://programmers.co.kr/learn/courses/30/lessons/12912)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/sum_of_integer_12912/Solution.java)
    - 일정 구간의 정수를 순차적으로 더하는 경우 가우스 공식을 사용하여 시간을 단축 시키도록 한다.
    - `for loop` : `10ms` -> `Gauss` : `0.5ms`
    - 간단한 알고리즘에도 수학공식을 적용하면 효율을 향상 시킬 수 있다는 것을 알게 되었다.

11. [12915 - 문자열 내 마음대로 정렬하기](https://programmers.co.kr/learn/courses/30/lessons/12915)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/custom_strings_sorting_12915/Solution.java)
    - `Comparator Interface` 사용이 미숙하여 구글링 했다. 다시 풀어보기.
    - `Arrays.sort()` 에 람다식으로 조건을 넣을 수 있다.
    - `Comparator & Arrays.sort` 의 원리를 알아야 아래 내장 함수를 활용 할 수 있겠다.
    - `Comparator - compareTo`, `Charactor.compare`

12. [12916 - 문자열 내 p와 y의 개수](https://programmers.co.kr/learn/courses/30/lessons/12916)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/number_of_py_12916/Solution.java)

13. [12917 - 문자열 내림차순으로 배치하기](https://programmers.co.kr/learn/courses/30/lessons/12917)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/descending_sort_12917/Solution.java)
    - `String` 문자열 로직 처리 시 (`Sorting` 등) `StringBuilder`를 사용하면 시간을 많이 단축 시킬 수 있다.

14. [12918 - 문자열 다루기 기본](https://programmers.co.kr/learn/courses/30/lessons/12918)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/number_filtering_12918/Solution.java)
    - `ASCII code`를 이용하여 풀었다.
    - `char`는 `int` 형 변환 하면 `ascii code`를 확인 할 수 있다.
    - 정규식으로 푸는 방법도 있다.

15. [12919 - 서울에서 김서방 찾기](https://programmers.co.kr/learn/courses/30/lessons/12919)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/finding_kim_12919/Solution.java)

16. [12921 - 소수 찾기](https://programmers.co.kr/learn/courses/30/lessons/12921)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/number_of_prime_12921/Solution.java)
    - 주어진 수 `N` 보다 작은 소수로만 나누는 조건으로 했을 경우 효율성 검사에서 실패했다.
    - 구글링으로 아래 수학적 조건을 이용하여 효율성 검사를 통과하였다. 수학적 지식이 없었으면 효율성에서 계속 떨어졌을 것 같다.
    - 주어진 수 `N`이 `2`부터 `N 제곱근` 범위에서 나누었을 때 `0`이 되는 수가 있다면, 그 수는 소수가 아니다. 즉, 이 범위내 나누어지는 수가 없다면 그 수는 소수이다.

17. [12922 - 수박수박수박수박수박수?](https://programmers.co.kr/learn/courses/30/lessons/12922)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/watermelon_12922/Solution.java)
    - `String vs. StringBuffer vs. StringBuilder` 차이점 복습
    - `String` :`Immutable` 불변성, 힙 영역에 생성되고 (GB가 동작하는 영역),한번 생성되면 할당 된 메모리 공간이 변하지않고, 추가한 만큼 객체가 생성된다.
    - `StringBuffer` : `Mutable`, 멀티 스레드 환경에서 동기화를 지원한다. 스레드에 안전한 프로그램이 필요할 때 사용한다.
    - `StringBuilder` : `Mutable`, 단일 스레드 환경에서 사용하고, 동기화를 보장하지 않는다. 연산이 많을 경우 가장 성능이 좋다.
    - 알고리즘에서 `String` 문자열 로직 처리 시 `StringBuilder`를 사용하도록 하자. 

18. [12925 - 문자열을 정수로 바꾸기](https://programmers.co.kr/learn/courses/30/lessons/12925)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/string_to_integer_12925/Solution.java)

19. [12928 - 약수의 합](https://programmers.co.kr/learn/courses/30/lessons/12928)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/sum_of_divisor_12928/Solution.java)
    - `n`의 약수는 `n/2`보다 클 수 없으므로 루프 범위를 줄일 수 있다.

20. [12926 - 시저 암호](https://programmers.co.kr/learn/courses/30/lessons/12926)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/caesar_cipher_12926/Solution.java)
    - `char`는 자동으로 `ascii` 치환되기 때문에 굳이 `ascii` 테이블 검색해서 숫자로 작성할 필요가 없다.
    - 대문자는 대문자로, 소문자는 소문자로만 돌아가기 때문에 분기처리 하였다.

21. [64061 - 크레인 인형뽑기 게임 : kakao 2019](https://programmers.co.kr/learn/courses/30/lessons/64061)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/puppeteer_64061/Solution.java)
    - `List`를 이용하여 풀었는데, `Stack`을 이용하여 풀이하면 더 좋을 것 같아 동일 한 코드를 `Stack` 구조로 변경하였다. 

22. [12930 - 이상한 문자 만들기](https://programmers.co.kr/learn/courses/30/lessons/12930)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/weird_string_12930/Solution.java)
    - 문제에 주어진 입출력 에제가 하나밖에 없고 고려해야 할 제한조건이 정확하게 제시되어 있지 않아 시간이 조금 걸렸다.
    - `Character.toUpperCase()`를 이용하여 대소문자로 바로 변환 가능하다.

23. [12931 - 자릿수 더하기](https://programmers.co.kr/learn/courses/30/lessons/12931)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/sum_of_digit_12931/Solution.java)
    - 가독성은 형변환 방식에 비해 떨어지지만, 나누기 산수계산으로 처리하면 효율은 조금 더 좋다.

24. [12932 - 자연수 뒤집어 배열로 만들기](https://programmers.co.kr/learn/courses/30/lessons/12932)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/reverse_number_12932/Solution.java)
    - `StringBuilder.reverse`로 풀 수 있었지만, 수학적으로 풀어보았다.

25. [12933 - 정수 내림차순으로 배치하기](https://programmers.co.kr/learn/courses/30/lessons/12933)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/descending_integer/Solution.java)

26. [12934 - 정수 제곱근 판별](https://programmers.co.kr/learn/courses/30/lessons/12934)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/squar_discriminator_12934/Solution.java)
    - `double`에서 ` int`로 타입 캐스팅 시 데이터 손실 주의하자.

27. [12935 - 제일 작은 수 제거하기](https://programmers.co.kr/learn/courses/30/lessons/12935)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/remove_minimum_12935/Solution.java)
    - `Stream` 사용 할 수 있으나 느리므로 `for loop`로 해결했다.

28. [12937 - 짝수와 홀수](https://programmers.co.kr/learn/courses/30/lessons/12937)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/even_odd_number_12937/Solution.java)

29. [67256 - 키패드 누르기 : kakao 2020](https://programmers.co.kr/learn/courses/30/lessons/67256)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/touch_keypad_67256/Solution.java)
    - 로컬 테스트 시 log 결과값은 잘 나오는데 프로그래머스 테스트 시 결과값이 다르게 나와서 실패한다. 이유를 잘 모르겠다.
    - 현재 좌, 우 위치에서 목표 번호까지의 거리를 구하는 로직은 구글링으로 블로그를 참고했다. [링크](https://0pencoding.github.io/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4/2020/07/03/%ED%82%A4%ED%8C%A8%EB%93%9C%EB%88%84%EB%A5%B4%EA%B8%B0_level1.html)

30. [12940 - 최대공약수와 최소공배수](https://programmers.co.kr/learn/courses/30/lessons/12940)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/gcd_lcm_12940/Solution.java)

    - 유클리드 호제법을 이용하여 재귀로 풀 수 있다.

      ```
      n을 m으로 나눈 나머지를 n이라 하면 (단 n>m), n과 m의 최대공약수는 m과 r의 최대공약수와 같다.
      ```

    - 최대공약수는 두 수 작은 수나 두 수의 차보다 작다.

    - 최대공약수 (`gcd`) : `유클리드 호제법`

    - 최소공배수 (`lcm`) : `(a * b) / gcd(a, b)`

31. [12943 - 콜라츠 추측](https://programmers.co.kr/learn/courses/30/lessons/12943)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/collatz_12943/Solution.java)
    - 재귀를 이용하여 해결했다.

32. [12944 - 평균 구하기](https://programmers.co.kr/learn/courses/30/lessons/12944)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/mean_value_12944/Solution.java)

33. [12947 - 하샤드 수](https://programmers.co.kr/learn/courses/30/lessons/12947)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/harshad_12947/Solution.java)

34. [12948 - 핸드폰 번호 가리기](https://programmers.co.kr/learn/courses/30/lessons/12948)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/hiding_phone_number_12948/Solution.java)

35. [12950 - 행렬의 덧셈](https://programmers.co.kr/learn/courses/30/lessons/12950)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/sum_or_matrix_12950/Solution.java)
    - 2차원 배열을 동적으로 초기화 해줄 때, 전체 `column`에 대해 선언해주고 반복 루프를 이용하여 각각의 `row`에 대해 초기화 해준다.

36. [12954 - x만큼 간격이 있는 n개의 숫자](https://programmers.co.kr/learn/courses/30/lessons/12954)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/number_list_12954/Solution.java)
    - `int` 자료형끼리 연산을 진행 후 해당 결과값을 `long` 자료형에 넣어주면 연산한 결과값이 `int` 범위보다 클 때 데이터 손실이 발생 할 수 있다.
    - 연산 시 임시로 형변환을 해주거나, `long` 자료형을 이용하여 덧셈 연산으로 해결한다.

37. [12969 - 직사각형 별찍기](https://programmers.co.kr/learn/courses/30/lessons/12969)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/print_rectangle_star_12969/Solution.java)

38. [12982 - 예산](https://programmers.co.kr/learn/courses/30/lessons/12982)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/budget_12982/Solution.java)

39. [17682 - 다트 게임 : kakao 2018](https://programmers.co.kr/learn/courses/30/lessons/17682)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/dart_17682/Solution.java)
    - 이런 규칙이 없는 문제는 `if - loop` 의 `depth`를 줄이고 깔끔한 코딩 스타일로 작성할 수는 없을까하고 고민했지만 다른 사람의 풀이를 보니 비슷했다.
    - `10점`의 조건이 데이터 파싱에 있어 조건을 추가하게 만들었다.

40. [42889 - 실패율 : kakao 2019](https://programmers.co.kr/learn/courses/30/lessons/42889)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_1/failure_rate_42889/Solution.java)
    - `stage`에 도달한 `player`가 없을 경우 실패율은 0으로 처리하는 조건을 고려하지 않았었다.
    - 문제는 통과했지만 실패율을 내림차순 정렬하고 그 값의 인덱스를 찾는 과정 등 복잡도를 낮춰야 할 것 같다.

-----------

#### LEVEL 2

1. [42587 - 프린터](https://programmers.co.kr/learn/courses/30/lessons/42587)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/print_42587/Solution.java)
   - `Deque`를 이용하여 풀이를 워하는 문제였으나 `List`를 이용하여 풀었다.
   - `bucket size`가 1인 경우도 고려해서 작성해야 루프에 빠지지 않는다.

2. [42584 - 주식가격](https://programmers.co.kr/learn/courses/30/lessons/42584)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/stock_42584/Solution.java)
   - `ArrayList`를 이용하여 해결했으나 시간복잡도로 인해 효율성 테스트에서 실패했다.
   - 주어진 데이터를 조회만 하면 되므로 배열로만 처리하여 효율성 테스트를 통과하였다.

3. [42588 - 탑](https://programmers.co.kr/learn/courses/30/lessons/42588)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/tower_42588/Solution.java)
   - 굳이 `stack`으로 풀어야 하나 싶다. 연습을 위해서는 `stack`사용을 연습해야 할까?

4. [42839 - 소수 찾기](https://programmers.co.kr/learn/courses/30/lessons/42839)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/find_prime_number_42839/Solution.java) 재도전하기

   - 재귀와 순열 알고리즘 학습이 필요하다.

     ```
     https://bcp0109.tistory.com/14
     ```

   - 순열 알고리즘이 정확히 이해가 안가서 다시 풀어봐야겠다.

5. [12899 - 124 나라의 숫자](https://programmers.co.kr/learn/courses/30/lessons/12899)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/country_of_124_12899/Solution.java)

   - 3진법은 기존의 2진법을 구하는 방식과 다른 점이 있다. 값을 3으로 나누었을 때 나머지가 0일 경우 `몫에 -1`을 더해주고 몫이 0이 될때까지 계속 진행한다.

   - 수학적으로 3진수에서 다음 몫을 구하는 방식

     ```
     n = (n - 1) / 3;
     ```

6. [42883 - 큰 수 만들기](https://programmers.co.kr/learn/courses/30/lessons/42883)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/make_big_number_42883/Solution.java)
   - `num[i]`가 `num[i+k]`까지 비교하여 그중에 `num[i]`보다 큰 값이 있으면 `num[i]`는 `result String`에 추가하지 않는다.
   - 다른 사람의 풀이를 보니 스택으로 많이 구현했다. 

7. [42583 - 다리를 지나는 트럭](https://programmers.co.kr/learn/courses/30/lessons/42583)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/truck_passing_by_bridge_42583/Solution.java) 재도전하기

8. [42586 - 기능개발](https://programmers.co.kr/learn/courses/30/lessons/42586)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/progresses_42586/Solution.java)
   - 남은 시간을 계산한 `workingTime` 배열을 가지고 현재 인덱스가 가진 값보다 큰 값이 나올 때까지 카운트하여 결과값을 저장한다.
   - 남은 일수가 모두 같거나, 작업이 하나인 경우를(현재 인덱스보다 큰 값이 나오지 않을 경우) 고려하여 조건문을 추가했다.

9. [42578 - 위장](https://programmers.co.kr/learn/courses/30/lessons/42578)

   - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/camouflage_42578/Solution.java)
   - `HashMap`을 이용한 문제였는데 배열스럽게 풀었다. 결과를 보고 `Hash`스럽게 코드를 개선하였다.

10. [42577 - 전화번호 목록](https://programmers.co.kr/learn/courses/30/lessons/42577)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/phone_book_42577/Solution.java)

    - 접두어 비교시 `Array` 메서드인 `startsWith`에 대하여 알게 되었다.

    - `String` 숫자를 `sorting` 하면 앞자리부터 비교하기 때문에 바로 다음 값만 비교할 수 있다.

      ```java
      // before
      [11955, 97674223, 1195524421, 9, 333]
      // after
      [11955, 1195524421, 333, 9, 97674223]
      ```

11. [42746 - 가장 큰 수](https://programmers.co.kr/learn/courses/30/lessons/42746)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/biggest_number_42746/Solution.java)

    - 좋은 생각이 나지 않아 구글링하였다. `compareTo` 메서드를 적절히 활용한 좋은 문제같다.

    - `compareTo` 메서드를 이용하여 두 String 객체를 더해서 큰 수에 우선순위가 있도록 정렬한다.

    - 아래 예시 코드가 정확히 어떤 방식으로 정렬되는지 이해해야 한다.

      ```java
      String[] num = {"11", "10", "33", "303", "909", "99"};
      Arrays.sort(num, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
      
      // result가 0이나 음수이면 자리바꿈을 하지 않고, 양수이면 자리바꿈을 수행한다.
      // 아래의 result = 9이므로 자리바꿈을 수행한다.
      ("99" + "909").compareTo("909" + "99")
      ```

12. [42885 - 구명보트](https://programmers.co.kr/learn/courses/30/lessons/42885)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/life_boat_42885/Solution.java)
    - 처음에 `ArrayList`를 이용하여 풀었으나, 효율성 테스트 중 하나를 통과하지 못했다. `Collection`을 사용해서 시간이 초과된 것으로 판단된다.
    - 가장 큰 `index`의 사람 한 명만 타거나 가장 작은 `index`와 가장 큰 `index`의 사람이 같이 타는 경우밖에 없으므로,  `Array`의 `index`만 변경하는 방식을 사용하여 다시 풀이하였다.

13. [42860 - 조이스틱](https://programmers.co.kr/learn/courses/30/lessons/42860)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/joystick_42860/Solution.java) 재도전하기
    - 좌, 우로 최소로 이동하는 알고리즘이 어렵다.
    - 우로 이동하다 좌로 이동할 수 있다. 좌로 이동하다 우로 이동할 수 있나?
    - 다음에 다시 풀어보도록 한다.
    - 풀이 참고 : https://keepgoing0328.tistory.com/71
    
14. [42842 - 카펫](https://programmers.co.kr/learn/courses/30/lessons/42842)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/carpet_42842/Solution.java)
    - 전체 타일 갯수의 약수들의 집합을 구하고, 약수와 몫의 합이 가장 작은 경우를 판별하여 풀이하였다.
    - 결과값이 갈색 타일의 갯수와 일치하는 지 여부도 판별해야 모든 테스트 케이스를 통과할 수 있다.

15. [12911 - 다음 큰 숫자](https://programmers.co.kr/learn/courses/30/lessons/12911)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/next_number_12911/Solution.java)
    - `Integer.bitCount()` 메서드를 이용하여 주어진 수의 1의 갯수를 구할 수 있다.

16. [12924 - 숫자의 표현](https://programmers.co.kr/learn/courses/30/lessons/12924)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/serial_number_12924/Solution.java)

17. [12909 - 올바른 괄호](https://programmers.co.kr/learn/courses/30/lessons/12909)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/braket_12909/Solution.java)
    - `()))((()` 와 같이 갯수가 일치해도 문법적으로 맞지 않는 경우도 확인해야 한다.

18. [42888 - 오픈채팅방 : kakao 2019](https://programmers.co.kr/learn/courses/30/lessons/42888?language=java)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/open_chat_42888/Solution.java)
    - `HashMap`과 `List`를 이용하여 어렵지않게 풀었다.

19. [42890 - 후보키 : kakao 2019](https://programmers.co.kr/learn/courses/30/lessons/42890)

    - [Solution] 재도전하기
    - 비트마스크에 대해 학습

20. [17683 -방금그곡 : kakao 2018](https://programmers.co.kr/learn/courses/30/lessons/17683)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/shazam_17683/Solution.java)
    - 처음 풀이에서 몇가지 테스트케이스에 통과하지 못했다. 다른 사람의 풀이를 보니 `C#`의 경우 `c`로 치환하여 풀이하였다.
    - 데이터를 저장하는 `Music` 클래스와 `C# -> c` 치환을 이용하여 다시 풀었다.
    
21. [17680 - 캐시 : kakao 2018](https://programmers.co.kr/learn/courses/30/lessons/17680)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/cache_17680/Solution.java)

    - `Queue`로 풀이하였으나 몇가지 테스트에 통과하지 못해서 `List`로 풀이하였다.

    - 두 가지의 실수 포인트가 있었다.

      ```java
      1. cache에 city값이 있는경우 LRU(Least Recently Used)이므로 현재 위치의 데이터를 지우고, List의 가장 뒤(tail)로 변경한다. Queue의 경우는 Last로 변경한다.
        
      2. 처음 cache를 주어진 cacheSize만큼 추가할 때 cache가 cacheSize만큼 채워지지 않고 cache hit하는 경우가 생길 수 있음을 고려해야한다.
      ```

22. [60057 - 문자열 압축 : kakao 2020](https://programmers.co.kr/learn/courses/30/lessons/60057)

    - [Solution] 재도전하기
    - 이상하게 안풀린다. 다음에 풀기로 결심했다.

23. [17687 - n진수 게임 : kakao 2018](https://programmers.co.kr/learn/courses/30/lessons/17687)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/n_game_17687/Solution.java)
    - 특정한 수 `number`를 `n`진수로 변환하는 메서드 코드를 작성해야 했는데, 이전에 [124 나라의 숫자](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/country_of_124_12899/Solution.java) 에서 3진수 구하는 문제를 풀었던 기억이 났다.
    - 진수변환하는 `nConvert`메서드에서 `StringBuilder`를 사용하면 `0.1ms`가 걸렸고, `String`을 사용하면 `15ms` 가까이 걸렸다.
    - 이를 보고 `String`을 사용해서 객체를 계속 추가하면 단순히 메모리 공간을 더 차지하는 수준이(`mutable`과 `immutable` 관점에서) 하니고 속도에도 영향을 준다는 것을 알게 되었다.

24. [17677 - 뉴스 클러스터링 : kakao 2018](https://programmers.co.kr/learn/courses/30/lessons/17677)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/news_clustering_17677/Solution.java)

    - `ArrayList`도 `Array`와 같이 단순히 `list1 = list2`로 복사하면 `call by reference` 주소값으로 복사가 된다. `list1.addAll(list2)`로 `value` 값을 복사해서 사용했다.

    - 영문자 이외의 모든 문자를 허용하지 않을 때(숫자, 공백, 특수문자 제거) 정규식과 `match` 메서드를 이용해보았다.

      ```java
      String regex = "^[a-zA-Z]*$";
      if (str.matches(regex)) {
        // str이 숫자, 공백, 특수문자 등 영문자 이외의 값을 갖고 있다면 false
        // str이 오직 영문자만 갖고있다면 true
      }
      ```

25. [17686 - 파일명 정렬 : kakao 2018](https://programmers.co.kr/learn/courses/30/lessons/17686)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/sorting_files_17686/Solution.java)
    - 정규식을 이용하였고, 클래스를 생성하여 객체지향적으로 풀었다.
    - 문자열을 파싱하고 조건에 맞도록 `Comparator`와 `compareTo`를 사용하여 정렬하는 문제였다. `Comparator` 사용법을 이해하여 블로그에 정리하였다.
    - [https://wooody92.github.io/algorithm/Algorithm-Comparator/](https://wooody92.github.io/algorithm/Algorithm-Comparator/)

26. [60058 - 괄호 변환 : kakao 2020](https://programmers.co.kr/learn/courses/30/lessons/60058)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/bracket_transform_60058/Solution.java)
    - 재귀를 이용한 문자열 처리 문제였고, 재귀 로직을 문제에서 지문 형식으로 알려주었다.
    - 지문을 보고 어떤 구조인지 이해가 안가서 구글링으로 지문을 이해했다.

27. [67257 - 수식 최대화 : kakao 2020](https://programmers.co.kr/learn/courses/30/lessons/67257)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/math_expression_67257/Solution.java) 재도전하기

    - 빠르게 풀어보려고 하드코딩으로 정리 없이 풀었는데, 테스트케이스에서 실패했다. 다시 천천히 풀어봐야겠다.

    - 다른 풀이들도 참고해보기

      ```
      https://codingjuny.tistory.com/42
      https://msmk530.tistory.com/147
      ```

28. [12981 - 영어 끝말잇기](https://programmers.co.kr/learn/courses/30/lessons/12981)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/word_chain_12981/Solution.java)
    - 중복 체크시 자료구조로 `Set`을 사용할 수 있었지만, 주어진 `words` 최대 길이가 100으로 매우 짧아 for 문으로 처리하였다.

29. [SQL - LEVEL 1](https://programmers.co.kr/learn/challenges)

    - 특정 조건 제외해서 검색한다.(`NOT * IN ('')`)

      ```sql
      SELECT animal_id, name FROM animal_ins WHERE NOT intake_condition IN ('Aged');
      ```

    - 여러 조건에서의 정렬 - 이름으로 우선 정렬하고 중복되면 날짜 역순으로 정렬한다.

      ```sql
      SELECT animal_id, name, datetime FROM animal_ins ORDER BY name, datetime DESC;
      ```

    - NULL 검색하기 (`WHERE * IS NULL`)

      ```sql
      SELECT animal_id FROM animal_ins WHERE name IS NULL;
      ```

    - NULL이 아닌 컬럼 검색하기

      ```sql
      SELECT animal_id FROM animal_ins WHERE name IS NOT NULL;
      ```

30. [SQL - LEVEL 2](https://programmers.co.kr/learn/challenges)

    - 특정 컬럼 NULL 체크 후 데이터 변경하여 조회하기(`NVL`, `IFNULL`)

      ```sql
      SELECT animal_type, IFNULL(name, 'No name'), sex_upon_intake FROM animal_ins ORDER BY animal_id;
      ```

    - 컬럼 갯수 세기 (`COUNT`)

      ```sql
      SELECT COUNT(animal_id) FROM animal_ins;
      ```

    - 그룹화 하여 조회 (`GROUP BY`)

      ```sql
      SELECT animal_type, COUNT(animal_id) FROM animal_ins GROUP BY animal_type ORDER BY animal_type;
      ```

    - 그룹에서의 조건 조회 (`HAVING`)

      ```sql
      SELECT name, COUNT(animal_id) FROM animal_ins GROUP BY name HAVING count(name) > 1 ORDER BY name;
      ```

    - Datetime에서 시간만 뽑기 (`HOUR`)

      ```sql
      SELECT HOUR(datetime) AS hour, COUNT(animal_id) FROM animal_outs GROUP BY HOUR(datetime) HAVING hour >= 9 AND hour <= 19 ORDER BY hour;
      ```

    - 다중 조건 검색 (`WHERE * IN ('')`)

      ```sql
      SELECT animal_id, name, sex_upon_intake FROM animal_ins WHERE name IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty') ORDER BY animal_id;
      ```

    - 부분적으로 일치하는 컬럼 조회 (`LIKE = ''`)

      [https://coding-factory.tistory.com/114](https://coding-factory.tistory.com/114)

      ```sql
      SELECT animal_id, name FROM animal_ins WHERE animal_type = 'Dog' AND name LIKE '%EL%' ORDER BY name;
      ```

    - IF 조건절 사용하기

      ```sql
      SELECT animal_id, name, IF(sex_upon_intake LIKE '%Neutered%' OR sex_upon_intake LIKE '%Spayed%', 'O', 'X') FROM animal_ins ORDER BY animal_id;
      ```

    - Date_Format 변경하기(`DATE_FORMAT(datetime, '')`)

      ```sql
      SELECT animal_id, name, DATE_FORMAT(datetime, '%Y-%m-%d') FROM animal_ins ORDER BY animal_id;
      ```

31. [64065 - 튜플 : kakao 2029](https://programmers.co.kr/learn/courses/30/lessons/64065)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/tuple_64065/Solution.java)
    - 문자열 파싱 문제였다. `!ArrayList.contains(str)`로 특정 문자열의 List 포함 여부를 확인할 수 있다.

32. [SQL - LEVEL 3](https://programmers.co.kr/learn/challenges)

    - 한 쪽에 포함되지 않은 데이터만 가져오기(`LEFT OUTER JOIN`, `WHERE i.animal_id IS NULL`)

      https://m.blog.naver.com/PostView.nhn?blogId=wideeyed&logNo=221435077767&proxyReferer=https:%2F%2Fwww.google.com%2F

    - `INNER JOIN == JOIN`, `LEFT OUTER JOIN == LEFT JOIN`

      ```sql
      SELECT o.animal_id, o.name FROM animal_outs AS o LEFT OUTER JOIN animal_ins AS i ON o.animal_id = i.animal_id WHERE i.animal_id IS NULL ORDER BY o.animal_id;
      ```

    - `INNER JOIN` 테이블에서의 날짜 차이(`DATEDIFF(i.datetime, o.datetime)`)

      ```sql
      SELECT i.animal_id, i.name FROM animal_ins AS i INNER JOIN animal_outs AS o ON i.animal_id = o.animal_id ORDER BY DATEDIFF(i.datetime, o.datetime) LIMIT 2;
      ```

33. [43165 - 타겟 넘버](https://programmers.co.kr/learn/courses/30/lessons/43165)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/target_number_43165/Solution.java)

    - 유형이 정해져있는 기본적인 dfs 재귀 문제이다. 트리 구조로 분기되는 방식을 이해하자.

    - 주어진 `numbers` 배열의 모든 값들을 탐색해야 하므로 `base case`는 `depth == numbers.length`이다.

    - 가장 아래 `depth`까지 왔을 때 `sum == target` 인지 확인한다.

      ```java
      public void dfs(int[] numbers, int depth, int sum, int target) {
        if (depth == numbers.length) {
          if (sum == target) {
            result++;
          }
          return;
        }
        dfs(numbers, depth + 1, sum + numbers[depth], target);
        dfs(numbers, depth + 1, sum - numbers[depth], target);
      }
      ```

34. [12945 - 피보나치 수](https://programmers.co.kr/learn/courses/30/lessons/12945)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/fibonacci_12945/Solution.java)
    - 일반적인 재귀에서 동일한 계산의 반복수행을 memoization(메모이제이션)으로 제거하여 실행 속도를 증가시킬 수 있다.
    - 이 문제에서는 피사노 주기를 이용한 문제이다.
    - 피사노 주기란 피보나치 수를 k로 나누었을 때, 그 나머지는 항상 주기를 갖는 성질이다. 

35. [49993 - 스킬트리](https://programmers.co.kr/learn/courses/30/lessons/49993)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/skill_tree_49993/Solution.java)

    - 매개 변수로 비교값을 받아 정규식을 이용하여 풀었다.

      ```java
      String regex = String.format("[%s]*$", base);
      ```

    - 스킬트리에 스킬이 하나도 포함되어있지 않다면 연계 스킬과 연관이 없으므로 result++을 해줘야 한다.

36. [12980 - 점프와 순간이동](https://programmers.co.kr/learn/courses/30/lessons/12980)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/jump_teleport_12980/Solution.java)
    - 어렵게 생각하지 않고 수학적으로 풀었다. 탐색의 함정에 빠질 수도 있는 문제같다.

37. [12977 - 소수 만들기](https://programmers.co.kr/learn/courses/30/lessons/12977)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/making_prime_number_12977/Solution.java)
    - 처음 풀이에서 세 수의 합을 HashMap에 넣고 중복 된 소수 판별을 줄였다.
    - 두번째 방식에서는 모든 합에 대해 소수 판별을 진행하지만 코드가 훨씬 간결하다.
    - 주어진 테스트 케이스로는 두 방식 모두 소요시간이 비슷했다.

38. [62048 - 멀쩡한 사각형](https://programmers.co.kr/learn/courses/30/lessons/62048)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/square_62048/Solution.java)

    - 알고리즘보다는 규칙을 찾기 위한 수학 문제에 가까운 것 같다.

    - width와 height이 주어졌을 때, 망가진 사각형의 갯수는 최대 공약수를 이용 해 구할 수 있다.

      ```java
      w + h - gcd;
      ```

39. [42626 - 더 맵게](https://programmers.co.kr/learn/courses/30/lessons/42626)

    - [Solution](https://github.com/wooody92/algorithm/blob/master/src/main/java/programmers/level_2/scoville_42626/Solution.java)
    - 처음에 ArrayList를 사용해서 풀었을 때는 효율성에 통과하지 못했다.
    - PriorityQueue 자료구조를 이용하여 동일한 로직의 코드를 작성하니 통과했다.
    - ArrayList 방식의 경우 `Collection.sort`로 정렬해주는 과정이 추가되기 때문에 시간 복잡도가 올라간 것으로 보인다.
    - Java의 PrimaryQueue의 경우 Heap으로 구현되어 있다.
    - 힙(Heap)은 최댓값 및 최솟값을 찾아내는 연산을 빠르게 하기 위해 고안된 완전 이진 트리의 특징을 갖는 자료구조이다.
    - 참고 링크
      - https://coding-factory.tistory.com/603
      - https://hannom.tistory.com/36
    
40. [42839 - 소수 찾기](https://programmers.co.kr/learn/courses/30/lessons/42839)

    - [Solution]
    - 이전에 작성한 순열과 소수 메서드를 이용해서 풀이하였다.
    - 순열과 조합은 알고리즘에서 문제풀이를 위한 수단으로 자주 사용하는 것 같다.
    - 풀이 자체는 어렵진 않았는데 순열을 참고자료없이 구현하는 연습을 해봐야겠다.
    - isPrime()에서 주어진 수가 2보다 큰 짝수일때는 false로 반환하면 약간의 성능을 올릴 수 있을 것 같다.
    
41. [12973 - 짝지어 제거하기](https://programmers.co.kr/learn/courses/30/lessons/12973?language=java)

    - [Solution]
    - 주어진 문자열 길이의 조건을 보면 1,000,000이다. 효율성을 생각해서 풀이하여야 한다.
    - 시간복잡도를 낮추기 위한 스택 자료구조의 장점이 돋보이는 문제였다.

