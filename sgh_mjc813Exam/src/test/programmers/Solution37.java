package test.programmers;

public class Solution37 {
    //school.programmers.co.kr/learn/courses/30/lessons/181847
    public static void main(String[] args) {
        Solution37 sol = new Solution37();
        System.out.println(sol.solution("0010"));
        System.out.println(sol.solution("854020"));
    }

    public String solution(String n_str) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < n_str.length(); i++) {
            if(n_str.charAt(i)!='0') {
                answer.append(n_str.substring(i,n_str.length()));
                break;
            }
        }
        return answer.toString();
    }
}
