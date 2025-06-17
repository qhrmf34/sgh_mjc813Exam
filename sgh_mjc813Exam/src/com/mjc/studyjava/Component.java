package com.mjc.studyjava;

import java.util.Comparator;

public class Component implements Comparable<Component> {
    private Name name;
    private CpuType cpu;
    public RamType ram;
    private StorageType storage;
    private GpuType gpu;
    private Integer price;
    private Integer qty;

    public enum Name{
        mjc813,
        mjc814,
        mjc815,
        Computer
    }

    public enum CpuType {
        Gen9_i5, Gen9_i7, Gen9_i9, Gen9_i11, Gen9_i13
    }
    public enum RamType {
        _2GB,_4GB,_8GB,_16GB,_32GB
    }
    public enum StorageType {
        _500GB, _1000GB, _2000GB, _4000GB, _8000GB,
    }
    public enum GpuType {
        GTX_1660, RTX_4080, Intel_A770
    }
    Component(){
        this(Name.Computer, null, null, null, null, null, 0);
//        this.name = Name.Computer;
//        this.cpu = null;
//        this.ram = null;
//        this.storage = null;
//        this.gpu = null;
//        this.price = null;
//        this.qty = null;
    }
    Component(Name name, CpuType cpu, RamType ram, StorageType storage, GpuType gpu,Integer price,Integer qty) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.price = price;
        this.qty = qty;
    }
    Component(Name name) {
        this(name, null, null, null, null, null, 0);
//        this.name = name;
//        this.cpu = null;
//        this.ram = null;
//        this.storage = null;
//        this.gpu = null;
//        this.price = null;
//        this.qty = null;
    }
    Component(Name name, CpuType cpu) {
        this(name, cpu, null, null, null, null, 0);
//        this.name = name;
//        this.cpu = cpu;
//        this.ram = null;
//        this.storage = null;
//        this.gpu = null;
//        this.price = null;
//        this.qty = null;
    }
    Component(Name name, CpuType cpu,RamType ram) {
        this(name, cpu, ram, null, null, null, 0);
//        this.name = name;
//        this.cpu = cpu;
//        this.ram = ram;
//        this.storage = null;
//        this.gpu = null;
//        this.price = null;
//        this.qty = null;
    }
    Component(Name name, CpuType cpu,RamType ram,StorageType storage) {
        this(name, cpu, ram, storage, null, null, 0);
//        this.cpu = cpu;
//        this.ram = ram;
//        this.storage = storage;
//        this.gpu = null;
//        this.price = null;
//        this.qty = null;
    }
    public Name getName() {
        return name;
    }
    public CpuType getCpu() {
        return cpu;
    }
    public RamType getRam() {
        return ram;
    }
    public StorageType getStorage() {
        return storage;
    }
    public GpuType getGpu() {
        return gpu;
    }
    public Integer getPrice() {
        return price;
    }
    public Integer getQty() {
        return qty;
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
        System.out.println("가격: " + (price==null?"조립중입니다.":price)+"\n");
        System.out.println("재고: " + (qty==null?"조립중입니다.":qty)+"\n");

    }
    public String toString() {
        return String.format(
                "이름 : %s\n CPU : %s\n RAM : %s\n Storage : %s\n Graphic : %s\n Price : %d\n Qty : %d\n",
                this.getName(), this.getCpu(), this.getRam(), this.getStorage(), this.getGpu(), this.getPrice(), this.getQty()
        );
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Component)) return false;
        Component other = (Component) obj;
        return this.cpu == other.cpu &&
                this.ram == other.ram &&
                this.storage == other.storage &&
                this.gpu == other.gpu &&
                this.name == other.name&&
                this.qty == other.qty&&
                this.price == other.price;
    }

    public int hashCode() {
        return name.hashCode() + cpu.hashCode() + ram.hashCode() + storage.hashCode() + gpu.hashCode() + price.hashCode() + qty.hashCode();
    }

    @Override
    public int compareTo(Component o) {
        return o.cpu.ordinal()-this.cpu.ordinal();
    }




}