package test.programmers;

public class Solution25 {
    //school.programmers.co.kr/learn/courses/30/lessons/181930
    public static void main(String[] args) {
        Solution25 sol = new Solution25();
        System.out.println(sol.solution(2,6,1));
        System.out.println(sol.solution(5,3,3));
        System.out.println(sol.solution(4,4,4));
    }
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a!=b&&a!=c&&b!=c){
            answer=a+b+c;
        }
        else if(a==b&&b==c){
            answer=(int)((a+b+c)*(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2))*(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)));
        }
        else{
            answer=(int)((a+b+c)*(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)));

        }
        return answer;
    }
}
