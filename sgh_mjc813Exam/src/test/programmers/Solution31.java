package test.programmers;

public class Solution31 {
    //school.programmers.co.kr/learn/courses/30/lessons/181873
    public static void main(String[] args) {
        Solution31 sol = new Solution31();
        System.out.println(sol.solution("programmers","p"));
        System.out.println(sol.solution("lowercase","x"));

    }

    public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp,alp.toUpperCase());
    }
}
