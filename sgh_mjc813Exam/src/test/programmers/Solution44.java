package test.programmers;

public class Solution44 {
    public static void main(String[] args) {
        //school.programmers.co.kr/learn/courses/30/lessons/181887
        Solution44 sol = new Solution44();
        System.out.println(sol.solution(new int[] {4, 2, 6, 1, 7, 6}));
        System.out.println(sol.solution(new int[] {-1, 2, 5, 6, 3}));
    }
    public int solution(int[] num_list) {
        int answer = 0;
        int answer2=0;
        for(int i=0;i<num_list.length;i++){
            if(i%2==0){
                answer2+=num_list[i];
            }
            else{
                answer+=num_list[i];
            }
        }
        return answer>answer2?answer:answer2;
    }
}
