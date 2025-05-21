package com.mjc.studyjava;

public class Herbivore extends Mammalia{
    public Herbivore(String name, int age) {
        super(name, age);
    }
    public Herbivore reproduce(String newName) {
        Herbivore newHerbivore = new Herbivore(newName, age);
        return newHerbivore;
    }
}
