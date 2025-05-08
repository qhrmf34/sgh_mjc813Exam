package test.programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution9 {
    public static void main(String[] args) {
        //school.programmers.co.kr/learn/courses/30/lessons/181891
        Solution9 sol = new Solution9();
        System.out.println(Arrays.toString(sol.solution(new int[]{2, 1, 6},1)));
        System.out.println(Arrays.toString(sol.solution(new int[]{5, 2, 1, 7, 5},3)));

    }
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> sol=new ArrayList<>();
        for(int i=0;i<num_list.length;i++){
            if(i>=n){
                sol.add(num_list[i]);
            }
        }
        for(int i=0;i<n;i++){
            sol.add(num_list[i]);
        }
        int[] answer=sol.stream().mapToInt(x->x).toArray();
        return answer;
    }
}
