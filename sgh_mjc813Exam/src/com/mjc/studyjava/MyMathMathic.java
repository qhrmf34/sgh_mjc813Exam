package com.mjc.studyjava;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyMathMathic {
    public static void main(String[] args) {
        MyMathMathic math = new MyMathMathic();
        System.out.println(math.getBigDecimal(-741874895, 1004780065));
        System.out.println(((Object) math.getIntegerArray(new int[]{1, 2, 44, 534, 6, 7})).getClass().getSimpleName());
        System.out.println(Arrays.toString(math.makeRandomIntArray(7)));
        System.out.println(math.makeEncryptString("mjc813", 5));
        System.out.println(math.makeDecryptString("ajjbqmcajrjzcgdchfbs8nrfw1ofwq3", 5));
    }

    public int avg(int[] array) {
        MyMathMathic m = new MyMathMathic();
        if(array==null){
            return 0;
        }
        int result = 0;
        result = m.sum(array) / array.length;
        return result;
    }

    public int sum(int[] array) {
        int result = 0;
        if(array==null){
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public int sumOfNumber(int[] array, int number) {
        int result = 0;
        if(array==null){
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % number == 0) {
                result += array[i];
            }
        }
        return result;
    }

    public int sumOfLoop(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                continue;
            }
            result += i;
        }
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                continue;
            }
            result += i;
        }
        return result;
    }

    public int sumOfFav(int a, int b) {
        if (a < b) {
            a += sumOfFav(a + 1, b);
        }
        return a;
    }

    public long square(int a, byte b) {
        long answer = 1;
        for (int i = 0; i < b; i++) {
            answer *= (long) a;
        }
        return answer;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public long mul(int a, int b) {
        return (long) a * b;
    }

    public int divM(int a, int b) {
        return a / b;
    }

    public int divN(int a, int b) {
        return a % b;
    }

    public boolean same(int a, int b) {
        return a == b;
    }

    public boolean same(String a, String b) {
        if(a==null||b==null){
            return false;
        }
        return a.equals(b);
    }

    public boolean notSame(int a, int b) {
        return !(a == b);
    }

    public boolean big(int a, int b) {
        return a > b;
    }

    public boolean small(int a, int b) {
        return a < b;
    }

    public int shiftLeft(int a, byte b) {
        return a << b;
    }

    public int shiftRight(int a, byte b) {
        return a >> b;
    }

    public int shiftRight0(int a, byte b) {
        return a >>> b;
    }

    public int absolute(int a) {
        return Math.abs(a);
    }

    public String toHex(int a) {
        return Integer.toHexString(a);
    }

    public String toBin(int a) {
        return Integer.toBinaryString(a);
    }

    public String toOct(int a) {
        return Integer.toOctalString(a);
    }

    public int toDec(String a) {
        if(a==null){
            return 0;
        }
        return Integer.parseInt(a);
    }

    BigDecimal getBigDecimal(int n, int s) {
        String a=n+"."+s;
        BigDecimal result = new BigDecimal(a);
        return  result;
    }

    Integer[] getIntegerArray(int[] array) {
        if(array==null){
            return null;
        }
        return Arrays.stream(array).boxed().toArray(Integer[]::new);
    }

    int[] makeRandomIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    String makeEncryptString(String text, int n) {
        if(text==null){
            return null;
        }

        Random random = new Random();
        int totalLength = text.length() * n + 1;

        String getRandom = random.ints(97, 123)
                .limit(totalLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        StringBuilder result = new StringBuilder();
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < totalLength; i++) {
            if (i != 0 && i % n == 0 && count < text.length()) {
                result.append(text.charAt(count));
                count++;
            } else {
                result.append(getRandom.charAt(count2));
                count2++;
            }
        }

        return result.toString();
    }
    String makeDecryptString(String code, int n){
        if(code==null){
            return null;
        }
        String result="";
        if(code==null){
            return null;
        }
        for(int i=0;i<code.length();i++){
            if(i%n==0&&i!=0){
                result+=code.charAt(i);
            }
        }

        return result;
    }

}


