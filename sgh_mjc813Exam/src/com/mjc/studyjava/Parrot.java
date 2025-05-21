package com.mjc.studyjava;

public class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }
    public void fly(){
        System.out.println(super.name+" "+super.wings+" 조금만 난다.");
    }
    public void eat(Object feed){
        if(feed instanceof String){
            System.out.println(super.name+" "+feed+" 를 먹는다.");
        }
    }
    public Parrot reproduce(String newName){
        Parrot parrot=new Parrot(newName, age);
        return parrot;
    }

}
