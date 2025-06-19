package com.mjc.studyjava.com.ch15;

import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.load(PropertiesExample.class.getClassLoader().getResourceAsStream("database.properties"));
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String user = prop.getProperty("username");
        String password = prop.getProperty("password");
        String admin = prop.getProperty("admin");
        System.out.println("driver: " + driver);
        System.out.println("url: " + url);
        System.out.println("user: " + user);
        System.out.println("password: " + password);
        System.out.println("admin: " + admin);




    }
}
