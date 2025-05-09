package test.programmers;
import java.util.*;

public class Solution17 {
    //school.programmers.co.kr/learn/courses/30/lessons/181909
    public static void main(String[] args) {
    Solution17 sol = new Solution17();
    System.out.println(Arrays.toString(sol.solution("banana")));
    System.out.println(Arrays.toString(sol.solution("programmers")));

    }
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i=0; i<my_string.length();i++){
            answer[i]=my_string.substring(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
