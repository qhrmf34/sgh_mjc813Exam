package test.programmers;

public class Solution1 {
    public static void main(String[] args){
        Solution1 sol=new Solution1();
        int result=sol.solution(new int[] {10,8,6}, 3);
        System.out.println("Solution1 :"+result);
    }
    public int solution(int[] box,int n){
        int answer=0;
        answer=(box[0]/n)*(box[1]/n)*(box[2]/n);
        return answer;
    }
}
