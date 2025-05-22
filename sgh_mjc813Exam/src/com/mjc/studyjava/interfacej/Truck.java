package com.mjc.studyjava.interfacej;

public class Truck implements ITruck {
    private String name;
    private int wheelCount;
    public Truck(String name, int wheelCount) {
        this.name = name;
        this.wheelCount = wheelCount;
    }
    public String getName() {
        return name;
    }
    public int getWheelCount() {
        return wheelCount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
    public String drive(){
        StringBuilder a = new StringBuilder();
        a.append(getWheelCount()+"개의 바퀴의 트럭 "+getName()+"을 운전한다.");
        return a.toString();
    }
    public String breakk(){
        StringBuilder a = new StringBuilder();
        a.append(getName()+"을 정지한다.");
        return a.toString();
    }

}
