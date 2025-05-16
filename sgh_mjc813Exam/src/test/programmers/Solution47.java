package test.programmers;

public class Solution47 {
    //school.programmers.co.kr/learn/courses/30/lessons/181931
    public static void main(String[] args) {
        Solution47 sol = new Solution47();
        System.out.println(sol.solution(3,4,new boolean[] {true, false, false, true, true}));
        System.out.println(sol.solution(7,1,new boolean[] {false, false, false, true, false, false, false}));
    }
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] result= new int[included.length];
        for(int i = 0; i < included.length; i++) {
            result[i]=a;
            a+=d;
        }
        int count=0;
        for(boolean dd:included){
            if(dd==true){
                answer+=result[count];
            }
            count++;
        }
        return answer;
    }
}
