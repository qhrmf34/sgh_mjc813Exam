package test.programmers;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        String result = sol.solution("hello", 3);
        System.out.println("Solution2 : " + result);
    }
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length();i++){
            for(int a=0; a<n; a++){
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}
