package test.programmers;

import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int[] result = sol.solution(new int[] {1, 0, 1, 1, 1, 3, 5});
        System.out.println("Solution3 : " + Arrays.toString(result));
    }
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }
        return answer;
    }
}