package com.mjc.studyjava;

public class MyMathMathic {
    

    public int avg(int [] array){
        MyMathMathic m=new MyMathMathic();
        int result=0;
        result = m.sum(array)/array.length;
        return result;
    }
    public int sum(int [] array){
        int result=0;
        for(int i=0;i<array.length;i++){
            result+=array[i];
        }
        return result;
    }
    public int sumOfNumber(int[] array, int number){
        int result=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%number==0) {
                result += array[i];
            }
        }
        return result;
    }
    public int sumOfLoop(int a, int b){
        int result=0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                continue;
            }
            result+=i;
        }
        for(int i=a;i<=b;i++){
            if(i%2==1){
                continue;
            }
            result+=i;
        }
        return result;
    }
    public int sumOfFav(int a, int b){
        if(a<b){
            a+=sumOfFav(a+1,b);
        }
        return a;
    }
    public long square(int a, byte b){
        long answer=1;
        for(int i=0; i<b; i++){
            answer *= (long)a;
        }
        return answer;
    }
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public long mul(int a, int b){
        return (long)a*b;
    }
    public int divM(int a, int b){
        return a/b;
    }
    public int divN(int a, int b){
        return a%b;
    }
    public boolean same(int a,int b){
        return a==b;
    }
    public boolean same(String a, String b){
        return a.equals(b);
    }
    public boolean notSame(int a, int b){
        return !(a==b);
    }
    public boolean big(int a,int b){
        return a>b;
    }
    public boolean small(int a,int b){
        return a<b;
    }
    public int shiftLeft(int a,byte b){
        return a<<b;
    }
    public int shiftRight(int a, byte b){
        return a>>b;
    }
    public int shiftRight0(int a, byte b){
        return a>>>b;
    }

    public int absolute(int a){
        return Math.abs(a);
    }
    public String toHex(int a){
        return Integer.toHexString(a);
    }
    public String toBin(int a){
        return Integer.toBinaryString(a);
    }
    public String toOct(int a){
        return Integer.toOctalString(a);
    }
    public int toDec(String a){
        return Integer.parseInt(a);
    }
}

