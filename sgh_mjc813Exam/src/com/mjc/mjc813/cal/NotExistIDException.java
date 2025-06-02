package com.mjc.mjc813.cal;

public class NotExistIDException extends Exception {
    public NotExistIDException() {}
    public NotExistIDException(String message) {
        super(message);
        System.out.println("아이디가 존재하지 않습니다.");
    }
}
