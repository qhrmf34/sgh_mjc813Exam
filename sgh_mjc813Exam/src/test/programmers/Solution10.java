package test.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution10 {
    //school.programmers.co.kr/learn/courses/30/lessons/181868
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        System.out.println(Arrays.toString(sol.solution(" i    love  you")));
        System.out.println(Arrays.toString(sol.solution("    programmers  ")));

    }

    public String[] solution(String my_string) {
        List<String> newList = new ArrayList<>();
        String a="";
        for(int i=0; i<my_string.length();i++){
            char ch = my_string.charAt(i);
            if (ch == ' ') {
                if (!a.equals("")) {
                    newList.add(a);
                    a = "";
                }
            } else {
                a += ch;
            }
        }
        if (!a.equals("")) {
            newList.add(a);
        }
        String[] answer = newList.toArray(new String[0]);

        return answer;
    }
}
