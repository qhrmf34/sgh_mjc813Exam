package com.mjc.mjc813.cal;

public class MyCalculator {
    public static void main(String[] args){
        MyCalculator mCal = new MyCalculator();
        int a=10;
        int b=30;
        int myAddInt= mCal.myAdd(a,b);
        System.out.println("두 수(" + a + ", " + b + ")의 값은 " + myAddInt + " 입니다.");
        long c = 123456789012345L;
        long d= 98765432198765L;
        long myAddLong = mCal.myAdd(c,d);
        System.out.println("두 수(" + c + ", " + d + ")의 값은 " + myAddLong + " 입니다.");
    }
    public int myAdd(int a, int b) {
        return a + b;
    }
    public long myAdd(long a, long b) {
        return a + b;
    }

}



