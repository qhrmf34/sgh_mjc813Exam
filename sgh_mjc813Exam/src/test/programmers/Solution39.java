package test.programmers;

public class Solution39 {
    public static void main(String[] args) {
        //school.programmers.co.kr/learn/courses/30/lessons/181831
        Solution39 sol = new Solution39();
        System.out.println(sol.solution(new int[][] {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}}));
        System.out.println(sol.solution(new int[][] {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}}));

    }

    public int solution(int[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == arr[j][i]) {
                    answer=1;
                }
                else{
                    return 0;
                }
            }
        }
        return answer;
    }
}
