package test.programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution28 {
    //school.programmers.co.kr/learn/courses/30/lessons/181895
    public static void main(String[] args) {
        Solution28 sol = new Solution28();
        System.out.println(Arrays.toString(sol.solution(new int[] {1, 2, 3, 4, 5},new int[][] {{1,3},{0,4}})));
    }
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> result = new ArrayList<>();
        for(int i=intervals[0][0];i<=intervals[0][1];i++){
            result.add(arr[i]);
        }
        for(int i=intervals[1][0];i<=intervals[1][1];i++){
            result.add(arr[i]);
        }
        int answer[]=result.stream().mapToInt(x->x).toArray();

        return answer;
    }
}
