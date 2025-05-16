package com.mjc.studyjava;

public class Computer {
    Component[] computer=new Component[5];

    public static void main(String[] args) {
        Computer m=new Computer();
        int count=1;
        m.computer[0]=new Component(Component.Name.mjc814, Component.CpuType.Gen9_i5, Component.RamType._4GB, Component.StorageType._500GB, Component.GpuType.GTX_1660);
        m.computer[1]=new Component(Component.Name.mjc813, Component.CpuType.Gen9_i7, Component.RamType._8GB, Component.StorageType._1000GB, Component.GpuType.Intel_A770);
        m.computer[2]=new Component(Component.Name.mjc815, Component.CpuType.Gen9_i9, Component.RamType._16GB, Component.StorageType._2000GB, Component.GpuType.RTX_4080);
        m.computer[3]=new Component(Component.Name.mjc815, Component.CpuType.Gen9_i7, Component.RamType._32GB, Component.StorageType._500GB, Component.GpuType.RTX_4080);
        m.computer[4]=new Component(Component.Name.mjc814, Component.CpuType.Gen9_i5, Component.RamType._8GB, Component.StorageType._1000GB, Component.GpuType.GTX_1660);
        for(Component c:m.computer){
            c.boot();
        }
        for(Component c:m.computer){
            System.out.println(count++ +"번 컴퓨터");
            c.spec();
        }
        for(Component c:m.computer){
            c.shutDown();
        }

        Component com=new Component();
        com.spec();
        Component com2=new Component(Component.Name.mjc814);
        com2.spec();
        Component com3=new Component(Component.Name.mjc813, Component.CpuType.Gen9_i9);
        com3.spec();
        Component com4=new Component(Component.Name.mjc815, Component.CpuType.Gen9_i7, Component.RamType._8GB);
        com4.spec();
        Component com5=new Component(Component.Name.mjc815, Component.CpuType.Gen9_i9, Component.RamType._16GB, Component.StorageType._2000GB);
        com5.spec();
        m.clickMouseLeftButton(200,400);
        m.clickMouseRightButton(600,200);
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

}