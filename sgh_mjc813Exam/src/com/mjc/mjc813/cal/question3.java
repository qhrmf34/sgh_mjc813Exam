package com.mjc.mjc813.cal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class question3 {
    public static void main(String[] args) {
        List<int[]> sol = new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                if (4 * i + 5 * j == 60) {
                    sol.add(new int[]{i, j});
                }
            }
        }
        int[][] answer = sol.toArray(new int[0][]);
        System.out.println(Arrays.deepToString(answer));
    }
    }

