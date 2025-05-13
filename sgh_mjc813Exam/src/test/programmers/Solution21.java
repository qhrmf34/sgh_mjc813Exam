package test.programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution21 {
    //school.programmers.co.kr/learn/courses/30/lessons/181919
    public static void main(String[] args) {
        Solution21 sol = new Solution21();
        System.out.println(Arrays.toString(sol.solution(10)));
    }
    public int[] solution(int n) {
        List<Integer> result=new ArrayList<>();
        result.add(n);
        while(n!=1){
            if(n%2==0){
                n=n/2;
                result.add(n);
            }
            else{
                n=3*n+1;
                result.add(n);
            }
        }
        int answer[]=result.stream().mapToInt(x->x).toArray();
        return answer;
    }
}
