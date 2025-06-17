package com.mjc.studyjava.com.ch17;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    private List<Product> list=new ArrayList<>();
    public static void main(String[] args) {
        StreamExample example=new StreamExample();
        example.addList();
        example.list.stream().forEach(System.out::println);
        example.ssum(example.list);
        example.aavg(example.list);
    }
    public void addList(){
        for( int i = 0; i < 10; i++ ) {
            Product p = new Product(i+1, "상품"+i, "회사", (int)(100000 * Math.random()));
            list.add(p);
        }
    }
    public void ssum(List<Product> list){
        int ssum= list.stream().mapToInt(Product::getPrice).sum();
        System.out.println("합계 : "+ssum);
    }
    public void aavg(List<Product> list){
        double aavg= list.stream().mapToInt(Product::getPrice).average().getAsDouble();
        System.out.println("평균 : "+aavg);
    }
}
