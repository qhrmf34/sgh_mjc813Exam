package test.programmers;

public class Solution29 {
    //school.programmers.co.kr/learn/courses/30/lessons/181874
    public static void main(String[] args) {
        Solution29 sol = new Solution29();
        System.out.println(sol.solution("abstract algebra"));
        System.out.println(sol.solution("PrOgRaMmErS"));
    }

    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length();i++){
            if(myString.charAt(i)=='a'){
                answer+='A';
            }
            else if(myString.charAt(i)!='A'){
                answer+=String.valueOf(myString.charAt(i)).toLowerCase();
            }
            else{
                answer+='A';
            }
        }
        return answer;
    }
}
