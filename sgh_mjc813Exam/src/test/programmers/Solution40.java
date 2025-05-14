package test.programmers;

import java.util.Arrays;

public class Solution40 {
    //school.programmers.co.kr/learn/courses/30/lessons/181920
    public static void main(String[] args) {
        Solution40 sol = new Solution40();
        System.out.println(Arrays.toString(sol.solution(3,10)));
    }
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        int count=0;
        for(int i=start_num;i<=end_num;i++){
            answer[count]=i;
            count++;
        }
        return answer;
    }
}
