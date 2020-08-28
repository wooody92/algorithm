package programmers.level_2.shazam_17683;

public class Solution {

    /**
     * music data Class
     */
    public class Music {
        private String title;
        private String code;
        private int minutes;

        public Music(String title, String code, int minutes) {
            this.title = title;
            this.code = code;
            this.minutes = minutes;
        }

        public String getTitle() {
            return title;
        }

        public int getMinutes() {
            return minutes;
        }

        public String getTotalCode() {
            StringBuilder sb = new StringBuilder();
            int times = minutes / code.length();
            int rest = minutes % code.length();
            for (int i = 0; i < times; i++) {
                sb.append(code);
            }
            for (int i = 0; i < rest; i++) {
                sb.append(code.charAt(i));
            }
            return sb.toString();
        }
    }

    public String solution(String melody, String[] musicInfo) {

        // init
        melody = replaceCharacter(melody);
        Music[] musicList = new Music[musicInfo.length];
        for (int i = 0; i < musicInfo.length; i++) {
            String[] data = musicInfo[i].split(",");
            String[] startTime = data[0].split(":");
            String[] endTime = data[1].split(":");
            int hour = Integer.parseInt(endTime[0]) - Integer.parseInt(startTime[0]);
            int minute = Integer.parseInt(endTime[1]) - Integer.parseInt(startTime[1]);
            int minutes = (hour * 60) + minute;
            musicList[i] = new Music(data[2], replaceCharacter(data[3]), minutes);
        }

        // logic
        // playingTime이 큰 경우에만 고려하여, 같은 재생 시간에서는 먼저 입력된 값을 저장한다.
        int comparator = 0;
        String result = "(None)";
        for (Music music : musicList) {
            String totalCode = music.getTotalCode();
            int playingTime = music.getMinutes();
            if (totalCode.contains(melody) && comparator < playingTime) {
                result = music.getTitle();
                comparator = playingTime;
            }
        }
        return result;
    }

    /**
     * '#'때문에 character length의 계산이 복잡해져서 치환한다.
     */
    private String replaceCharacter(String melody) {
        return melody.replaceAll("C#", "c")
            .replaceAll("D#", "d")
            .replaceAll("E#", "e")
            .replaceAll("F#", "f")
            .replaceAll("G#", "g")
            .replaceAll("A#", "a")
            .replaceAll("B#", "b");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String m = "ABC";
        String[] musicInfo = {"10:30,10:50,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        System.out.println(solution.solution(m, musicInfo));
    }
}
