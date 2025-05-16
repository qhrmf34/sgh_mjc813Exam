package com.mjc.studyjava;

public class Component {
    private Name name;
    private CpuType cpu;
    private RamType ram;
    private StorageType storage;
    private GpuType gpu;

    public enum Name{
        mjc813,
        mjc814,
        mjc815,
        Computer
    }

    public enum CpuType {
        Gen9_i5, Gen9_i7, Gen9_i9
    }
    public enum RamType {
        _4GB,_8GB,_16GB,_32GB
    }
    public enum StorageType {
        _500GB, _1000GB, _2000GB
    }
    public enum GpuType {
        GTX_1660, RTX_4080, Intel_A770
    }
    Component(){
        this.name = Name.Computer;
        this.cpu = null;
        this.ram = null;
        this.storage = null;
        this.gpu = null;
    }
    Component(Name name, CpuType cpu, RamType ram, StorageType storage, GpuType gpu) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
    }
    Component(Name name) {
        this.name = name;
        this.cpu = null;
        this.ram = null;
        this.storage = null;
        this.gpu = null;
    }
    Component(Name name, CpuType cpu) {
        this.name = name;
        this.cpu = cpu;
        this.ram = null;
        this.storage = null;
        this.gpu = null;
    }
    Component(Name name, CpuType cpu,RamType ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = null;
        this.gpu = null;
    }
    Component(Name name, CpuType cpu,RamType ram,StorageType storage) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = null;
    }
    public void boot(){
        System.out.println(name + " 가 켜졌습니다."+"\n");
    }
    public void shutDown(){
        System.out.println(name + " 가 꺼집니다."+"\n");
    }
    public void spec(){
        System.out.println("이름: " + (name==null?"조립중입니다.":name));
        System.out.println("CPU: " + (cpu==null?"조립중입니다.":cpu));
        System.out.println("RAM: " + (ram==null?"조립중입니다.":ram));
        System.out.println("Storage: " + (storage==null?"조립중입니다.":storage));
        System.out.println("Graphic: " + (gpu==null?"조립중입니다.":gpu)+"\n");

    }
}