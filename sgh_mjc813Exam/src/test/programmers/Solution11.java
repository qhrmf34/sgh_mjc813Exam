package test.programmers;

import java.util.Arrays;

public class Solution11 {
    public static void main(String[] args) {
        //school.programmers.co.kr/learn/courses/30/lessons/181896
        Solution11 sol = new Solution11();
        System.out.println("Solution 11: "+ sol.solution(new int[] {12, 4, 15, 46, 38, -2, 15}));
        System.out.println("Solution 11: "+ sol.solution(new int[] {13, 22, 53, 24, 15, 6}));

    }

    public int solution(int[] num_list) {
        int answer = 0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]<0){
                answer=i;
                break;
            }
            else{
                answer=-1;
            }
        }
        return answer;
    }
}
