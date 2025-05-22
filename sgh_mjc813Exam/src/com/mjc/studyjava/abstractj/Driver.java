package com.mjc.studyjava.abstractj;

public class Driver {
    private String name;
    private int age;
    private Vehicle vehicle;
    public Driver(String name, int age, Vehicle vehicle) {
        this.name = name;
        this.age = age;
        this.vehicle = vehicle;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void drive() {
        if(vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            System.out.println("운전수 "+getName()+ "은 "+truck.getWheelCount()+"개의 바퀴의 트럭 "+ truck.getName()+"을 운전한다.");
        }
        else if(vehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) vehicle;
            System.out.println("운전수 "+getName()+ "은 "+bicycle.getWheelCount()+"개의 바퀴의 자전거 "+ bicycle.getName()+"을 이동한다.");

        }
    }
    public void breakk(){
        if(vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            System.out.println("운전수 "+getName()+ "은 "+ truck.getName()+"을 정지한다.");
        }
        else if(vehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) vehicle;
            System.out.println("운전수 "+getName()+ "은 "+bicycle.getName()+"을 정지한다.");

        }
    }
}
