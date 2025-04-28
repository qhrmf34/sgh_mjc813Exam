public class Solution4 {
        // https://school.programmers.co.kr/learn/courses/30/lessons/120956
        public static void main(String[] args) {
            Solution4 sol = new Solution4();
            int result = sol.solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
            System.out.println("Solution4 : " + result);
        }
        public int solution(String[] babbling) {
                int answer = 0;
                String[] nephew = {"aya", "ye", "woo", "ma"};

                for (int i = 0; i < babbling.length; i++) {
                    String bab = babbling[i];
                    for (int j = 0; j < nephew.length; j++) {
                        bab = bab.replace(nephew[j], " ");
                    }
                    bab = bab.replace(" ", "");

                    if (bab.length() == 0) {
                        answer++;
                    }
                }

                return answer;
        }


}
