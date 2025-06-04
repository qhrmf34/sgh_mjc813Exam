package ch12.sec;

public class CarAgency implements Rentable<Car>{
    public Car rent(){
        return new Car();
    }
}
