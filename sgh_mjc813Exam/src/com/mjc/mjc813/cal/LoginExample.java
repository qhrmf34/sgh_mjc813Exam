package com.mjc.mjc813.cal;

public class LoginExample {
    public static void main(String[] args) {
        try{
            login("white","13245");
        }   catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            login("blue","54321");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void login(String id, String password) throws NotExistIDException,WrongPasswordException{
        if(!id.equals("blue")){
            throw new NotExistIDException(id);
        }
        if(!password.equals("12345")){
            throw new WrongPasswordException(password);
        }
    }
}
