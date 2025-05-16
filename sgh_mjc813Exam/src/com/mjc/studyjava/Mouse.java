package com.mjc.studyjava;

public class Mouse {
    private int pointX;
    private int pointY;
    public void moveMouse(int x, int y) {
        pointX = x;
        pointY = y;
    }

    public void clickLeftButton(){
            System.out.println("마우스(" + pointX + "," + pointY + ")"+"왼쪽버튼 클릭됨");
    }
    public void clickRightButton(){
        System.out.println("마우스(" + pointX + "," + pointY + ")"+"오른쪽버튼 클릭됨");
    }
}
