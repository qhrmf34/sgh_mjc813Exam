package test.programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution32 {
    //school.programmers.co.kr/learn/courses/30/lessons/181835
    public static void main(String[] args) {
        Solution32 sol = new Solution32();
        System.out.println(Arrays.toString(sol.solution(new int[] {1, 2, 3, 100, 99, 98},3)));
        System.out.println(Arrays.toString(sol.solution(new int[] {1, 2, 3, 100, 99, 98},2)));
    }
    public int[] solution(int[] arr, int k) {
        List<Integer> result=new ArrayList<>();
        int[] answer={};
        for(int i:arr){
            result.add(i);
        }
        if(k%2==1){
            answer=result.stream().mapToInt(x->k*x).toArray();
        }
        else{
            answer=result.stream().mapToInt(x->k+x).toArray();
        }

        return answer;
    }

}
