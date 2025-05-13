package test.programmers;

public class Solution20 {
    public static void main(String[] args) {
        //school.programmers.co.kr/learn/courses/30/lessons/181915
        Solution20 sol = new Solution20();
        System.out.println(sol.solution("cvsgiorszzzmrpaqpe", new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
        System.out.println(sol.solution("zpiaz", new int[] {1, 2, 0, 0, 3}));

    }
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i=0; i<index_list.length;i++){
            answer+=my_string.charAt(index_list[i]);
        }
        return answer;
    }
}
