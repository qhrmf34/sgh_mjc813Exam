package com.mjc.studyjava.abstractj;

public abstract class Vehicle {
    private int wheelCount;
    public Vehicle(int wheelCount) {
        this.wheelCount = wheelCount;
    }
    public int getWheelCount() {
        return wheelCount;
    }
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
    public abstract void move();
    public abstract void stop();
}
