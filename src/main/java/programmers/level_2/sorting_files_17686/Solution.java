package programmers.level_2.sorting_files_17686;

import java.util.Arrays;

/**
 * 1. FileInfo Class 만들고 정렬 기준에 맞추어 데이터 가공하여 저장
 * 2. 기준에 맞도록 정렬해서 해당 인덱스 저장
 * 3. 정렬된 인덱스 기준으로 files 정렬
 */
public class Solution {

    class FileInfo {

        private int idx;
        private String head;
        private Integer number;

        public FileInfo(int idx, String head, Integer number) {
            this.idx = idx;
            this.head = head;
            this.number = number;
        }
    }

    public String[] solution(String[] files) {

        // init FileInfo class
        FileInfo[] fileInfos = new FileInfo[files.length];
        for (int i = 0; i < files.length; i++) {
            int numberIndex = getNumberIndex(files[i]);
            int tailIndex = getTailNumber(files[i], numberIndex);
            String head = files[i].substring(0, numberIndex);
            String number = files[i].substring(numberIndex, tailIndex);
            fileInfos[i] = new FileInfo(i, head.toLowerCase(), Integer.parseInt(number));
        }

        // sort by head. if same, then sort by number
        Arrays.sort(fileInfos, (o1, o2) -> {
            if (o1.head.equals(o2.head)) {
                return o1.number.compareTo(o2.number);
            }
            return o1.head.compareTo(o2.head);
        });

        // result
        String[] result = new String[files.length];
        for (int i = 0; i < result.length; i++) {
            int sortedIndex = fileInfos[i].idx;
            result[i] = files[sortedIndex];
        }
        return result;
    }

    public int getNumberIndex(String file) {
        int numberIndex = -1;
        String regex = "[0-9]*$";
        String[] temp = file.split("");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].matches(regex)) {
                numberIndex = i;
                break;
            }
        }
        return numberIndex;
    }

    public int getTailNumber(String file, int numberIndex) {
        int tailIndex = file.length();
        String regex = "[0-9]*$";
        String[] temp = file.split("");
        for (int i = numberIndex; i < temp.length; i++) {
            if (!temp[i].matches(regex)) {
                tailIndex = i;
                break;
            }
        }
        return tailIndex;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[] files = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        solution.solution(files);
    }
}
