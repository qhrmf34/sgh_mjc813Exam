package com.sghcheck.lib;

public class MjcValidCheck {
    public boolean isValidPhoneNumber(String text){

        if(text==null||text.length()!=13||!text.startsWith("010-")){
            return false;
        }
        if(text.charAt(8)!='-'){
            return false;
        }
        for(int i=4;i<=7;i++){
              if(text.charAt(i) < '0' || text.charAt(i) > '9'){
                  return false;
              }
        }
        for(int i=9;i<text.length();i++){
            if(text.charAt(i) < '0' || text.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }

    public boolean isValidZipNumber(String text){
        if(text==null||text.length()!=5||text.charAt(0)=='0'){
            return false;
        }
        for(int i=1;i<text.length();i++){
            if(text.charAt(i) < '0' || text.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }

    public boolean isValidEmail(String text){
        if(!text.contains("@")||!text.contains(".")){
            return false;
        }
        int connect = text.indexOf("@");
        int com = text.indexOf(".");
        if(connect==0||connect+2>com||text.length()<com+3){
            return false;
        }
        return true;
    }
}
