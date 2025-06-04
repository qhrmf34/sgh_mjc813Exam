package ch12.sec;

public class HomeAgency implements Rentable<Home>{
    public Home rent(){
        return new Home();
    }
}
