package test.programmers;

public class Solution30 {
    //school.programmers.co.kr/learn/courses/30/lessons/181865
    public static void main(String[] args) {
        Solution30 sol = new Solution30();
        System.out.println(sol.solution("43 + 12"));
        System.out.println(sol.solution("0 - 7777"));
        System.out.println(sol.solution("40000 * 40000"));
    }
    public int solution(String binomial) {
        int answer = 0;
        for(int i=0; i<binomial.length();i++){
            if(binomial.charAt(i)=='+'){
                answer=Integer.parseInt(binomial.substring(0,i-1))+Integer.parseInt(binomial.substring(i+2,binomial.length()));
            }
            else if(binomial.charAt(i)=='-'){
                answer=Integer.parseInt(binomial.substring(0,i-1))-Integer.parseInt(binomial.substring(i+2,binomial.length()));
            }
            else if(binomial.charAt(i)=='*'){
                answer=Integer.parseInt(binomial.substring(0,i-1))*Integer.parseInt(binomial.substring(i+2,binomial.length()));
            }
        }
        return answer;
    }
}
