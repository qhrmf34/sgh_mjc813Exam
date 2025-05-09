package com.mjc.mjc813.cal;

import java.util.Arrays;

public class question2 {
    public static void main(String[] args) {
        int[][] c=new int[1][2];
        while(true){
            int a=(int)(Math.random()*6)+1;
            int b=(int)(Math.random()*6)+1;
            if(a+b==5){
                c[0][0]=a;
                c[0][1]=b;
                break;
            }
        }
        System.out.println(Arrays.deepToString(c));

    }

}
