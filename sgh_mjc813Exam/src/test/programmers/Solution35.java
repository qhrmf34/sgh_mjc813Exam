package test.programmers;

public class Solution35 {
    //school.programmers.co.kr/learn/courses/30/lessons/181864
    public static void main(String[] args) {
        Solution35 sol = new Solution35();
        System.out.println(sol.solution("ABBAA","AABB"));
        System.out.println(sol.solution("ABAB","ABAB"));
    }

    public int solution(String myString, String pat) {
        String result="";
        for(char a:myString.toCharArray()){
            if(a=='A'){
                result+="B";
            }
            else if(a=='B'){
                result+="A";
            }
        }
        int answer = 0;
        if(result.contains(pat)){
            answer=1;
        }
        return answer;
    }
}
