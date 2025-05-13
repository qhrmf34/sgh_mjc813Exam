package test.programmers;

public class Solution22 {
    //school.programmers.co.kr/learn/courses/30/lessons/181926
    public static void main(String[] args) {
        Solution22 sol = new Solution22();
        System.out.println(sol.solution(0,"wsdawsdassw"));
    }
    public int solution(int n, String control) {
        int answer = 0;
        for(int i=0;i<control.length();i++){
            char a=control.charAt(i);
            if(a=='w'){
                n+=1;
            }
            else if(a=='s'){
                n-=1;
            }
            else if(a=='d'){
                n+=10;
            }
            else if(a=='a'){
                n-=10;
            }
        }
        return n;
    }
}
