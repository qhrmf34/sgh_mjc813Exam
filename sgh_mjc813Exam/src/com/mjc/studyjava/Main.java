package com.mjc.studyjava;

public class Main{
    Computer[] computer=new Computer[5];
    public static void main(String[] args) {
        Main m=new Main();
        int count=1;
        m.computer[0]=new Computer("mjc813","Gen9_i5","4GB","500GB","GTX_1660");
        m.computer[1]=new Computer("mjc814","Gen10_i5","8GB","1000GB","GTX_1080");
        m.computer[2]=new Computer("mjc815","Gen11_i5","16GB","2000GB","GTX_2080");
        m.computer[3]=new Computer("mjc816","Gen12_i5","32GB","3000GB","GTX_3080");
        m.computer[4]=new Computer("mjc817","Gen13_i5","64GB","4000GB","GTX_4080");
        for(Computer c:m.computer){
            c.boot();
        }
        for(Computer c:m.computer){
            System.out.println(count++ +"번 컴퓨터");
            c.spec();
        }
        for(Computer c:m.computer){
            c.shutDown();
        }

    }
}