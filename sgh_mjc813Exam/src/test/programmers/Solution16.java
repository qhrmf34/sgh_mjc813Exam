package test.programmers;

public class Solution16 {
    public static void main(String[] args) {
        //school.programmers.co.kr/learn/courses/30/lessons/181908
        Solution16 sol = new Solution16();
        System.out.println(sol.solution("banana","ana"));
        System.out.println(sol.solution("banana","nan"));
        System.out.println(sol.solution("banana","wxyz"));
        System.out.println(sol.solution("banana","abanana"));
    }
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.endsWith(is_suffix))
            answer=1;
        return answer;
    }
}
