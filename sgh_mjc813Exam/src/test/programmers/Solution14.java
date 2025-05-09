package test.programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution14 {
    //school.programmers.co.kr/learn/courses/30/lessons/181901
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        System.out.println(Arrays.toString(sol.solution(10,3)));
        System.out.println(Arrays.toString(sol.solution(15,5)));

    }
    public int[] solution(int n, int k) {
        ArrayList<Integer> sol=new ArrayList<>();
        for(int i=k; i<=n;i++){
            if(i%k==0){
                sol.add(i);
            }
        }
        int[] answer=sol.stream().mapToInt(x->x).toArray();

        return answer;
    }
}
