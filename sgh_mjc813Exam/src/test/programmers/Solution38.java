package test.programmers;

import java.util.Arrays;

public class Solution38 {
    //school.programmers.co.kr/learn/courses/30/lessons/181833
    public static void main(String[] args) {
        Solution38 sol = new Solution38();
        System.out.println(Arrays.deepToString(sol.solution(3)));
        System.out.println(Arrays.deepToString(sol.solution(6)));
        System.out.println(Arrays.deepToString(sol.solution(1)));

    }
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++) {
            answer[i][i]=1;
        }
        return answer;
    }
}
