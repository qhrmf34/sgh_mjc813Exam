package test.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution8 {
    //school.programmers.co.kr/learn/courses/30/lessons/181886

    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        System.out.println("Solution8:"+ Arrays.toString(sol.solution(new String[] {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})));
    }


    public String[] solution(String[] names) {
        List<String> newList = new ArrayList<>();
        newList.add(names[0]);
        int count=0;
        for(int i=0;i<names.length;i++){
            count++;
            if(count==6){
                newList.add(names[i]);
                count=1;
            }
        }
        String[] answer = newList.toArray(new String[0]);


        return answer;
    }
}
