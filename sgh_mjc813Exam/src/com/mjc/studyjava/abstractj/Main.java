package com.mjc.studyjava.abstractj;

public class Main {
    public static void main(String[] args) {
        Driver driver=new Driver("손기현",21,new Truck("트럭1",23,4));
        driver.drive();
        driver.brake();
        Driver driver1=new Driver("김철수",42,new Bicycle("자전거2",2));
        driver1.drive();
        driver1.brake();
    }
}
