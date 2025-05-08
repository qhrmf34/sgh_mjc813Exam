package test.programmers;

public class Solution7 {
   //school.programmers.co.kr/learn/courses/30/lessons/181884
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        System.out.println("Solution7:"+sol.solution(new int[]{34, 5, 71, 29, 100, 34},123));
        System.out.println("Solution7:"+sol.solution(new int[]{58, 44, 27, 10, 100},139));

    }
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i=0;i<numbers.length;i++){
            answer+=numbers[i];
            if(answer>n){
                break;
            }
        }
        return answer;
    }
}
