package test.programmers;

public class Solution12 {
    //school.programmers.co.kr/learn/courses/30/lessons/181898
    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        System.out.println(sol.solution(new int[] {0, 0, 0, 1},1));
    }

    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i=0; i<arr.length;i++){
            if(i>=idx&&arr[i]==1){
                answer=i;
                break;
            }
            else{
                answer=-1;
            }
        }
        return answer;
    }
}
