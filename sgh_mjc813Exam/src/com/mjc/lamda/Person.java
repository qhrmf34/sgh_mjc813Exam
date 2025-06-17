package com.mjc.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    public void printHuman(INumberProc inp){
        inp.process("홍길동",22);
    }
    public void printCar(INumberProc inp){
        inp.process("BMW",10);
    }
    public void printArray(IArrayProc iap){
        List<Integer> test=new ArrayList<>(Arrays.asList(11,12,13,14,15,16,17,18,19,20));
        iap.process(test);
    }
}
