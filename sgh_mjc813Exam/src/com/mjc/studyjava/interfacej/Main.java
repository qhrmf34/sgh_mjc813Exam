package com.mjc.studyjava.interfacej;

public class Main {
    public static void main(String[] args) {
        Driver driver=new Driver("기현",33,new Bicycle("자전거1",2));
        driver.drive();
        driver.breakk();
        driver=new Driver("기현2",24,new Truck("트럭1",4));
        driver.drive();
        driver.breakk();
    }
}
