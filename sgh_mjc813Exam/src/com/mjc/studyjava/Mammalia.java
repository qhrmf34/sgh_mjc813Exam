package com.mjc.studyjava;

public class Mammalia extends Animal {
    public Mammalia(String name, int age) {
        super(name, age);
    }
    public void feedingMilk(){
        System.out.println(super.name+" 젖을 먹인다.");
    }
    public void eat(Object feed) {
        if (feed instanceof String) {
            System.out.println(super.name + "은 " + feed +"를 먹는다");
        }
    }
    public Mammalia reproduce(String newName){
        Mammalia newMammalia = new Mammalia(newName, age);
        return newMammalia;
    }
}
