package test.programmers;

public class Solution18 {
    //school.programmers.co.kr/learn/courses/30/lessons/181911
    public static void main(String[] args) {
        Solution18 sol = new Solution18();
        System.out.println(sol.solution(new String[] {"progressive", "hamburger", "hammer", "ahocorasick"},new int[][] {{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i=0;i<my_strings.length;i++){
            answer+=my_strings[i].substring(parts[i][0],parts[i][1]+1);
        }

        return answer;
    }
}
