package test.programmers;

import java.util.Arrays;

public class Solution6 {
    //school.programmers.co.kr/learn/courses/30/lessons/181882
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        System.out.println("Solution6="+ Arrays.toString(sol.solution(new int[]{1, 2, 3, 100, 99, 98})));
    }

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=50&&arr[i]%2==0){
                answer[i]=(arr[i]/2);
            }
            else if(arr[i]<50&&arr[i]%2==1){
                answer[i]=(arr[i]*2);
            }
            else{
                answer[i]=arr[i];
            }
        }
        return answer;
    }
}
