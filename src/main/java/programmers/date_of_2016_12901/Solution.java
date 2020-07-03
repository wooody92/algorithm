package programmers.date_of_2016_12901;

public class Solution {

    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int days = 0;

        for (int i = 0; i < a - 1; i++) {
            days += month[i];
        }
        days += b - 1;
        answer = day[days % 7]; // 여기서 -1을 하면 테스트 케이스에 실패한다.
        return answer;
    }

    public static void main(String[] args) {
        Solution dateOfYear = new Solution();
        System.out.println(dateOfYear.solution(5, 24));
    }
}
