package test.programmers;

public class Solution23 {
    //school.programmers.co.kr/learn/courses/30/lessons/181925
    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        System.out.println(sol.solution(new int[] {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=1; i<numLog.length;i++){
            if(numLog[i]==numLog[i-1]+1){
                answer+="w";
            }
            else if(numLog[i]==numLog[i-1]-1){
                answer+="s";
            }
            else if(numLog[i]==numLog[i-1]+10){
                answer+="d";
            }
            else if(numLog[i]==numLog[i-1]-10){
                answer+="a";
            }
        }
        return answer;
    }
}
