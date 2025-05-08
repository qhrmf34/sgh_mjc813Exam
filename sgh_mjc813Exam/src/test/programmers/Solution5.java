package test.programmers;
//school.programmers.co.kr/learn/courses/30/lessons/181878?language=java
public class Solution5 {
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        System.out.println("Solution5:"+s.solution("AbCdEfG","aBc"));
        System.out.println("Solution5:"+s.solution("aaAA","aaaaa"));

    }

    public int solution(String myString, String pat) {
        int answer = 0;
        if(myString.toLowerCase().contains(pat.toLowerCase())){
            return 1;
        }
        return answer;
    }

}
