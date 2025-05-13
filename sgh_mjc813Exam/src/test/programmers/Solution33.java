package test.programmers;

public class Solution33 {
    //school.programmers.co.kr/learn/courses/30/lessons/181834#
    public static void main(String[] args) {
        Solution33 sol = new Solution33();
        System.out.println(sol.solution("abcdevwxyz"));
        System.out.println(sol.solution("jjnnllkkmm"));
    }
    public String solution(String myString) {
        String answer = "";
        for(char b:myString.toCharArray()){
            if(b<'l'){
                answer+='l';
            }
            else{
                answer+=b;
            }
        }
        return answer;
    }
}
