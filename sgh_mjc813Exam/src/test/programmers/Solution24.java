package test.programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution24 {
    //school.programmers.co.kr/learn/courses/30/lessons/181927
    public static void main(String[] args) {
        Solution24 sol = new Solution24();
        System.out.println(Arrays.toString(sol.solution(new int[]{2, 1, 6})));
        System.out.println(Arrays.toString(sol.solution(new int[]{5, 2, 1, 7, 5})));
    }
    public int[] solution(int[] num_list) {
        int aa=num_list.length;
        List<Integer> result = new ArrayList<>();
        for(int i:num_list){
            result.add(i);
        }
        if(num_list[aa-1]>num_list[aa-2]){
            result.add(num_list[aa-1]-num_list[aa-2]);
        }
        else{
            result.add(num_list[aa-1]*2);
        }

        int answer[]=result.stream().mapToInt(x->x).toArray();
        return answer;
    }
}

