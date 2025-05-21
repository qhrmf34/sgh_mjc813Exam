package com.mjc.studyjava;

public class Eagle extends Bird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(super.name + " " + wings + " 높이 난다.");
    }

    public void eat(Object feed) {
        if (feed instanceof Animal) {
            Animal a = (Animal) feed;
            System.out.println(super.name + "은 " + a.name+"를 먹는다");
        }
    }
    public Eagle reproduce(String newName){
        Eagle e = new Eagle(newName, super.age);
        return e;
    }
}