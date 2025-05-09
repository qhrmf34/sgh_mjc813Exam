package test.programmers;

import java.util.Arrays;

public class Solution13 {
    //school.programmers.co.kr/learn/courses/30/lessons/181899
    public static void main(String[] args){
    Solution13 sol=new Solution13();
    System.out.println(Arrays.toString(sol.solution(10,3)));
    }
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num-end_num+1];
        for(int i=0;i<answer.length;i++){
            answer[i]=start_num-i;
        }
        return answer;
    }
}

