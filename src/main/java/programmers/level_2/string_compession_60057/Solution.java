package programmers.level_2.string_compession_60057;

public class Solution {

    public int solution(String s) {
        int min = s.length();

        for (int range = 1; range <= s.length() / 2; range++) {
            StringBuilder sb = new StringBuilder();
            String base = s.substring(0, range);
            String next = "";
            int count = 1;
            for (int i = 1; i < s.length() / range; i++) {
                next = s.substring(i * range, (i * range) + range);
                if (base.equals(next)) {
                    count++;
                    continue;
                }
                sb.append(count);
                sb.append(base);
                base = next;
                count = 1;
            }
            // last
            sb.append(count);
            sb.append(base);
            System.out.println(">>> " + sb.toString().replaceAll("1", ""));
            min = Math.min(min, sb.toString().replaceAll("1", "").length());
        }
        return min;
    }

    public int solution4(String s) {
        int min = s.length();

        for (int range = 1; range <= s.length() / 2; range++) {
            StringBuilder sb = new StringBuilder();
            String base = s.substring(0, range);
            String next = "";

            for (int i = 0; i <= s.length() - range; i++) {
                int count = 1;
                for (int j = i + range; j < s.length() - range; j += range) {
                    next = s.substring(j, j + range);
                    if (!base.equals(next)) {
                        break;
                    }
                    count++;
                }
                sb.append(count);
                sb.append(base);
                base = next;
            }
            System.out.println(">>> " + sb.toString().replaceAll("1", ""));
            Math.min(min, sb.toString().replaceAll("1", "").length());
        }
        return min;
    }

    public int solution2(String s) {
        int min = s.length();

        StringBuilder sb = new StringBuilder();
        int range = 2;
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            String temp = "";
            for (int j = i + range; j < s.length() - range + 1; j += range) {
                String current = s.substring(i, i + range);
                String next = s.substring(j, j + range);
                if (!current.equals(next)) {
                    break;
                }
                temp = current;
                count++;
            }
            sb.append(count);
            sb.append(temp);
            i += count - 1;
        }

        System.out.println(sb.toString().replaceAll("1", ""));
        return sb.toString().replaceAll("1", "").length();
    }

    /**
     * 문자를 1개씩 비교할 경우
     */
    public int solution3(String s) {
        int min = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    break;
                }
                count++;
            }
            sb.append(count);
            sb.append(s.charAt(i));
            i += count - 1;
        }
        System.out.println(sb.toString().replaceAll("1", ""));
        return sb.toString().replaceAll("1", "").length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

//        String s = "aabbaccc";
        String s = "ababcdcdababcdcd";
        System.out.println(solution.solution(s));
    }
}
