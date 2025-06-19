package com.mjc.studyjava;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Computer {
    private Component[] computer=new Component[5];
    private static TreeSet<Component> computerSet=new TreeSet<Component>();
    private static TreeSet<Component> computerSet2=new TreeSet<>(new ComputerComparable());

    public static void main(String[] args) {
        Computer m=new Computer();
        m.computerAdd();
//        m.computerBoot();
        for(Component c:m.computer){
            computerSet.add(c);
        }
        Iterator<Component> it=computerSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(Component c:m.computer){
            computerSet2.add(c);
        }
        Iterator<Component> it2=computerSet2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }


        m.computerStreamSum();
        m.computerStreamLow();
//        Component com=new Component();
//        com.spec();
//        Component com2=new Component(Component.Name.mjc814);
//        com2.spec();
//        Component com3=new Component(Component.Name.mjc813, Component.CpuType.Gen9_i9);
//        com3.spec();
//        Component com4=new Component(Component.Name.mjc815, Component.CpuType.Gen9_i7, Component.RamType._8GB);
//        com4.spec();
//        Component com5=new Component(Component.Name.mjc815, Component.CpuType.Gen9_i9, Component.RamType._16GB, Component.StorageType._2000GB);
//        com5.spec();
//        m.clickMouseLeftButton(200,400);
//        m.clickMouseRightButton(600,200);
//        System.out.println(m.toString());
    }

    public void computerAdd(){
        computer[0]=new Component(Component.Name.mjc814, Component.CpuType.Gen9_i5, Component.RamType._8GB, Component.StorageType._500GB, Component.GpuType.GTX_1660,1000000,7);
        computer[1]=new Component(Component.Name.mjc813, Component.CpuType.Gen9_i7, Component.RamType._4GB, Component.StorageType._2000GB, Component.GpuType.Intel_A770,1600000,3);
        computer[2]=new Component(Component.Name.mjc815, Component.CpuType.Gen9_i9, Component.RamType._16GB, Component.StorageType._1000GB, Component.GpuType.RTX_4080,1450000,5);
        computer[3]=new Component(Component.Name.mjc814, Component.CpuType.Gen9_i11, Component.RamType._2GB, Component.StorageType._8000GB, Component.GpuType.GTX_1660,700000,25);
        computer[4]=new Component(Component.Name.mjc814, Component.CpuType.Gen9_i11, Component.RamType._2GB, Component.StorageType._8000GB, Component.GpuType.GTX_1660,700000,25);
    }

    public void computerStreamSum(){
        int pricesum=computerSet.stream().mapToInt(i->i.getPrice()*i.getQty()).sum();
        System.out.println("총합계는 : "+pricesum);
    }

    public void computerStreamLow(){
        Component a= computerSet.last();
        int qty=computerSet.stream().filter(i->i.equals(a)).mapToInt(i->i.getQty()).sum();
        System.out.println("가장 낮은 cpu 재고 : "+qty);
    }


    public void computerBoot(){
        int count=1;
        for(Component c:computer){
            c.boot();
        }
        for(Component c:computer){
            System.out.println(count++ +"번 컴퓨터");
            c.spec();
        }
        for(Component c:computer){
            c.shutDown();
        }
    }


    public void clickMouseLeftButton(int x,int y){
        Mouse mouse=new Mouse();
        mouse.moveMouse(x,y);
        mouse.clickLeftButton();
    }
    public void clickMouseRightButton(int x,int y){
        Mouse mouse=new Mouse();
        mouse.moveMouse(x,y);
        mouse.clickRightButton();
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Component c1 : computer) {
            sb.append(String.format(c1.toString()+"\n"));
        }
        return sb.toString();
    }


}