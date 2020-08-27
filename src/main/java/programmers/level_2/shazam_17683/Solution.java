package programmers.level_2.shazam_17683;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    class Music {
        private int minutes;
        private String code;
        private String title;

        public Music(int minutes, String code, String title) {
            this.minutes = minutes;
            this.code = code;
            this.title = title;
        }

        public int getMinutes() {
            return minutes;
        }

        public String getTitle() {
            return title;
        }

        public String getCode(int count, String code) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count; i++) {
                if (code.charAt(i) == '#') {
                    continue;
                }
                if (code.charAt(i + 1) == '#') {
                    sb.append(code.charAt(i) + "#");
                    count++;
                    continue;
                }
                sb.append(code.charAt(i));
            }
            return sb.toString();
        }

        public String getTotalCode() {
            StringBuilder sb = new StringBuilder();
            int codeLength = getCodeLength(code);

            if (minutes < codeLength) {
                return getCode(minutes, code);
            }

            int times = minutes / codeLength;
            int rest = minutes % codeLength;
            for (int i = 0; i < times; i++) {
                sb.append(code);
            }
            sb.append(getCode(rest, code));
            return sb.toString();
        }

        public int getCodeLength(String code) {
            return code.length() - getHashCount(code);
        }

        public int getHashCount(String code) {
            int count = 0;
            for (int i = 0; i < code.length(); i++) {
                if (code.charAt(i) == '#') {
                    count++;
                }
            }
            return count;
        }

        // m : ABC, condition : ABC#의 경우는 false
        public boolean isContain(String m) {
            String totalCode = getTotalCode();
            if (totalCode.contains(m)) {
                int nextIndex = totalCode.indexOf(m) + m.length();
                if (totalCode.charAt(nextIndex) != '#') {
                    return true;
                }
            }
            return false;
        }
    }

    public String solution(String m, String[] musicInformation) {
        Music[] music = new Music[musicInformation.length];
        int hour = 0;
        int minute = 0;
        for (int i = 0; i < musicInformation.length; i++) {
            String[] data = musicInformation[i].split(",");
            String[] startTime = data[0].split(":");
            String[] lastTime = data[1].split(":");
            hour = Integer.parseInt(lastTime[0]) - Integer.parseInt(startTime[0]);
            minute = Integer.parseInt(lastTime[1]) - Integer.parseInt(startTime[1]);
            music[i] = new Music((hour * 60) + minute, data[3], data[2]);
        }

        // 주어진 코드 m과 일치하는 Music을 모두 찾는다.
        List<Music> myMusicList = new ArrayList<>();
        for (Music musicInfo : music) {
            if (musicInfo.isContain(m)) {
                myMusicList.add(musicInfo);
            }
        }

        // 조건에 일치하는 Music의 갯수에 따라 제목을 반환한다.
        if (myMusicList.size() == 1) {
            return myMusicList.get(0).getTitle();
        }
        // 조건에 일치하는 Music이 다수일경우 시간을 비교하고, 시간도 일치할 경우 먼저 입력된 Music을 반환한다.
        if (myMusicList.size() > 1) {
            int lastIndex = myMusicList.size() - 1;
            Music myMusic = myMusicList.get(lastIndex);
            for (int i = lastIndex; i > 0 ; i--) {
                if (myMusicList.get(i).getMinutes() < myMusicList.get(i - 1).getMinutes()) {
                    myMusic = myMusicList.get(i - 1);
                }
            }
            return myMusic.getTitle();
        }
        return "`(None)`";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String m = "ABC";
        String[] musicInfo = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        System.out.println(solution.solution(m, musicInfo));
    }
}
