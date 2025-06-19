package ch01.verify;

import java.util.*;

public class Example {
    public static void main(String[] args){
        System.out.println("개발자가 되기 위한 필수 개발 언어 Java");
        List<Ex> exs = new ArrayList<Ex>();
        exs.add(new Ex(null,"a"));
        exs.add(new Ex(null,"b"));
        exs.add(new Ex(null,"c"));

        int d = exs.stream()
                .filter(e -> e.getA() != null)
                .mapToInt(e -> e.getA())
                .max()
                .orElse(4);
        System.out.println(d);
    }
}
