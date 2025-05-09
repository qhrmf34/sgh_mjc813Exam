package test.programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution15 {
    public static void main(String[] args) {
        //school.programmers.co.kr/learn/courses/30/lessons/181906
        Solution15 sol = new Solution15();
        System.out.println(sol.solution("banana","ban"));
        System.out.println(sol.solution("banana","nan"));
        System.out.println(sol.solution("banana","abcd"));
        System.out.println(sol.solution("banana","bananan"));
    }
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String result="";
        List<String> newList = new ArrayList<>();
        for(int i=0; i<my_string.length();i++){
            result+=my_string.charAt(i);
            newList.add(result);
        }
        String[] ListResult=newList.toArray(new String[0]);
        for(String s : ListResult){
            if(s.equals(is_prefix)){
                answer=1;
            }
        }
        return answer;
    }
}
