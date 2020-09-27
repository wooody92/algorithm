package reference.regex;

public class Solution {

    public String parsing(String str) {
        String regex = "[a-z0-9\\-_.]*$";
        String[] temp = str.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (temp[i].matches(regex)) {
                sb.append(temp[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
