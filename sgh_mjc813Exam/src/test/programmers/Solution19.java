package test.programmers;

public class Solution19 {
    //school.programmers.co.kr/learn/courses/30/lessons/181914
    public static void main(String[] args) {
        Solution19 sol = new Solution19();
        System.out.println(sol.solution("123"));
        System.out.println(sol.solution("78720646226947352489"));
    }

    public int solution(String number) {
        int answer = 0;
        for(int i=0;i<number.length();i++){
            answer+=Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return answer%9;
    }
}
