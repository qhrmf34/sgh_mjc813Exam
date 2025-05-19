package com.mjc.mjc813.cal;

public class ShopService {
    private static ShopService singleton=new ShopService();
    private ShopService() {
    }
    public static ShopService getInstance() {
        return singleton;
    }
}
