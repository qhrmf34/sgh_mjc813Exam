package com.mjc.studyjava;

import java.util.Comparator;

public class ComputerComparable implements Comparator<Component> {
    @Override
    public int compare(Component o1, Component o2) {
        return o1.ram.ordinal()-o2.ram.ordinal();
    }
}
