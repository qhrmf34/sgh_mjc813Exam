package test.programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.List;
public class Solution36 {
    //school.programmers.co.kr/learn/courses/30/lessons/181844
    public static void main(String[] args) {
        Solution36 sol = new Solution36();
        System.out.println(Arrays.toString(sol.solution(new int[] {293, 1000, 395, 678, 94},new int[] {94, 777, 104, 1000, 1, 12})));
        System.out.println(Arrays.toString(sol.solution(new int[] {110, 66, 439, 785, 1},new int[] {377, 823, 119, 43})));
    }
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer2 = new ArrayList<Integer>();
        List<int[]> list = Arrays.asList(delete_list);

        for(int a:arr){
            if(!IntStream.of(delete_list).anyMatch(x -> x == a)){
                answer2.add(a);
            }
        }


        int[] answer=answer2.stream().mapToInt(x->x).toArray();
        return answer;
    }
}
