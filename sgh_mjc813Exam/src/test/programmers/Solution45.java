package test.programmers;

import java.util.Arrays;

public class Solution45 {
    //school.programmers.co.kr/learn/courses/30/lessons/181869
    public static void main(String[] args) {
        Solution45 sol = new Solution45();
        System.out.println(Arrays.toString(sol.solution("i love you")));
        System.out.println(Arrays.toString(sol.solution("programmers")));
    }
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
}
