package com.mjc.studyjava.interfacej;


public class Driver {
    private String name;
    private int age;
    private IVehicle ivehicle;
    public Driver(String name, int age, IVehicle ivehicle) {
        this.name = name;
        this.age = age;
        this.ivehicle = ivehicle;
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
    public IVehicle getIvehicle() {
        return ivehicle;
    }
    public void setIvehicle(IVehicle ivehicle) {
        this.ivehicle = ivehicle;
    }
    public void drive(){
        if(ivehicle instanceof Truck){
            Truck truck = (Truck) ivehicle;
            System.out.println("운전수 "+getName()+"은 "+truck.getWheelCount()+"개의 바퀴의 트럭 "+truck.getName()+"을 운전한다.");
        } else if (ivehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) ivehicle;
            System.out.println("운전수 "+getName()+"은 "+bicycle.getWheelCount()+"개의 바퀴의 자전거 "+bicycle.getName()+"을 이동한다.");

        }
    }
    public void breakk(){
        if(ivehicle instanceof Truck) {
            Truck truck = (Truck) ivehicle;
            System.out.println("운전수 "+getName()+ "은 트럭 "+ truck.getName()+"을 정지한다.");
        }
        else if(ivehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) ivehicle;
            System.out.println("운전수 "+getName()+ "은 자전거 "+bicycle.getName()+"을 정지한다.");

        }
    }
}
