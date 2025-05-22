package com.mjc.studyjava.abstractj;

public class Truck extends Vehicle {
    private String name;
    private int ton;
    public Truck(String name, int ton, int wheelCount) {
        super(wheelCount);
        this.name = name;
        this.ton = ton;
    }
    public String getName() {
        return name;
    }
    public int getTon() {
        return ton;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTon(int ton) {
        this.ton = ton;
    }
    public void move(){

    };
    public void stop(){

    };
}
