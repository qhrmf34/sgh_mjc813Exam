package com.mjc.mjc813.cal;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {}
    public WrongPasswordException(String message) {
        super(message);
        System.out.println("패스워드가 틀립니다.");
    }
}
