package com.mjc.studyjava.abstractj;

public class Bicycle extends Vehicle {
    private String name;
    public Bicycle(String name,int wheelCount) {
        super(wheelCount);
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void move(){};
    public void stop(){};
}
