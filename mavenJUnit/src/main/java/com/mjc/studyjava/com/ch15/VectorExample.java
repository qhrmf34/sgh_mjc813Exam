package com.mjc.studyjava.com.ch15;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list=new Vector<Board>();
        Thread a=new Thread(()->{
                for(int i=1;i<=1000;i++){
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
        }});
        Thread b=new Thread(()->{
            for(int i=1001;i<=2000;i++){
                list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
            }});
        a.start();
        b.start();

        try{
            a.join();
            b.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        int size=list.size();
        System.out.println("총 객체수"+size);


    }
}
