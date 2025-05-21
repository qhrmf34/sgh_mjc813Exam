package com.mjc.studyjava;

public class Carnivore extends Mammalia{
    public Carnivore(String name, int age) {
        super(name, age);
    }
    public void eat(Object feed){
        if(feed instanceof Herbivore){
            Herbivore herb = (Herbivore) feed;
            System.out.println(this.name+"은 "+herb.name+"를 먹는다");
        }
    }
    public Carnivore reproduce(String newName){
        Carnivore c = new Carnivore(newName, this.age);
        return c;
    }
}
