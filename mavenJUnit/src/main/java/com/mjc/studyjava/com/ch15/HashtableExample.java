package com.mjc.studyjava.com.ch15;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, Integer> map=new Hashtable<String, Integer>();
        Thread thread1=new Thread(()->{
           for(int i=1;i<=1000;i++){
               map.put(String.valueOf(i),i);
        }
        });
        Thread thread2=new Thread(()->{
            for(int i=1001;i<=2000;i++){
                map.put(String.valueOf(i),i);
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        int size=map.size();
        System.out.println(size);
    }
}
