package test.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution46 {
    //school.programmers.co.kr/learn/courses/30/lessons/181888
    public static void main(String[] args) {
        Solution46 sol = new Solution46();
        System.out.println(Arrays.toString(sol.solution(new int[] {4, 2, 6, 1, 7, 6},2)));
        System.out.println(Arrays.toString(sol.solution(new int[] {4, 2, 6, 1, 7, 6},4)));


    }
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < num_list.length; i+=n) {
            list.add(num_list[i]);
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
