package test.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution41 {
    //school.programmers.co.kr/learn/courses/30/lessons/181867
    public static void main(String[] args) {
        Solution41 sol = new Solution41();
        System.out.println(Arrays.toString(sol.solution("oxooxoxxox")));
        System.out.println(Arrays.toString(sol.solution("xabcxdefxghi")));
    }

    public int[] solution(String myString) {
        List<Integer> result=new ArrayList<>();
        int count=0;
        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i)=='x'){
                result.add(count);
                count=0;
            }
            else{
                count++;
            }
        }
        result.add(count);

        int[] answer=result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
