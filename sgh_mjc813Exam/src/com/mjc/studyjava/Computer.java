package com.mjc.studyjava;

public class Computer {
    String name;
    String cpu;
    String ram;
    String storage;
    String gpu;
    Computer(String name, String cpu, String ram, String storage, String gpu) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
    }
    public void boot(){
        System.out.println(name + " 가 켜졌습니다.");
    }
    public void shutDown(){
        System.out.println(name + " 가 꺼집니다.");
    }
    public void spec(){
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage" + storage);
        System.out.println("Graphic" + gpu);

    }
}