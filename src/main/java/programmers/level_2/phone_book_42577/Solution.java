package programmers.level_2.phone_book_42577;

import java.util.Arrays;

public class Solution {

    /**
     * 나의 풀이
     */
    public boolean solution(String[] phoneBook) {
        boolean flag = true;
        for (int i = 0; i < phoneBook.length; i++) {
            for (int j = 0; j < phoneBook.length; j++) {
                if (i == j) {
                    continue;
                }
                if (phoneBook[j].contains(phoneBook[i])) {
                    for (int k = 0; k < phoneBook[i].length(); k++) {
                        if (phoneBook[i].charAt(k) != phoneBook[j].charAt(k)) {
                            flag = true;
                            break;
                        }
                        flag = false;
                    }
                    if (!flag) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Array - startsWith 메서드를 사용하여 위처럼 일일히 구현한 것을 간결하게 표현할 수 있다.
     */
    public boolean solution2(String[] phoneBook) {
        for (int i = 0; i < phoneBook.length - 1; i++) {
            for (int j = i + 1; j < phoneBook.length; j++) {
                if (phoneBook[i].startsWith(phoneBook[j])) {
                    return false;
                }
                if (phoneBook[j].startsWith(phoneBook[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * sorting을 이용하여 for문을 한번만 돌릴 수 있다.
     * String의 숫자를 sorting하면 앞자리부터 비교하기 때문에 바로 다음 값만 비교할 수 있다.
     */
    public boolean solution3(String[] phoneBook) {
        Arrays.sort(phoneBook);
        System.out.println(Arrays.toString(phoneBook));
        for (int i = 0; i < phoneBook.length - 1; i++) {
            if (phoneBook[i + 1].startsWith(phoneBook[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] phoneBook = {"11955", "97674223", "1195524421", "9", "333"};
        System.out.println(solution.solution3(phoneBook));
    }
}
