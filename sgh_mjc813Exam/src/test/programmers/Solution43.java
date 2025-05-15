package test.programmers;

public class Solution43 {
    //school.programmers.co.kr/learn/courses/30/lessons/12911
    public static void main(String[] args) {
        Solution43 sol = new Solution43();
        System.out.println(sol.solution(78));
        System.out.println(sol.solution(15));
    }

    public int solution(int n) {
        int a=this.count(n);
        int answer = n+1;
        while(true){
            if(a==this.count(answer)) {
                break;
            }
            answer++;
        }
        return answer;
    }

    public int count(int n){
        int count=0;
        String a=Integer.toBinaryString(n);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
