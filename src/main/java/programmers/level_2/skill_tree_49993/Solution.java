package programmers.level_2.skill_tree_49993;

public class Solution {

    public int solution(String skill, String[] skillTrees) {
        int result = 0;
        for (String skillTree : skillTrees) {
            skillTree = parsing(skill, skillTree);
            if (skillTree.length() == 0) {
                result++;
                continue;
            }
            if (skill.contains(skillTree) && skill.charAt(0) == skillTree.charAt(0)) {
                result++;
            }
        }
        return result;
    }

    public String parsing(String base, String str) {
        String regex = String.format("[%s]*$", base);
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
        Solution solution = new Solution();
        String skill = "CBD";
        String[] skillTrees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution.solution(skill, skillTrees));

        System.out.println(solution.parsing(skill, "CD"));
    }
}
