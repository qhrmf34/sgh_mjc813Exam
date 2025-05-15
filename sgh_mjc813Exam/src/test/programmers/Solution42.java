package test.programmers;

import java.util.Arrays;

public class Solution42 {
    //school.programmers.co.kr/learn/courses/30/lessons/12939
    public static void main(String[] args) {
        Solution42 sol = new Solution42();
        System.out.println(sol.solution("1 2 3 4"));
        System.out.println(sol.solution("-1 -2 -3 -4"));
        System.out.println(sol.solution("-1 -1"));
    }
    public String solution(String s) {
        String[] res=s.split(" ");
        int[] res2=new int[res.length];
        for(int i=0;i<res.length;i++){
            res2[i]=Integer.parseInt(res[i]);
        }
        Arrays.sort(res2);
        String answer=res2[0]+" "+res2[res2.length-1];
        return answer;
    }

}
