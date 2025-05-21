package com.mjc.studyjava;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Bird("닭",12);
        System.out.println(animal.reproduce("새").name);
        Animal animal2=new Eagle("독수리",33);
        animal2.eat(animal);
        Bird bird=new Bird("참새",44);
        bird.fly();
        bird.flap();
        Bird bird2=new Eagle("비둘기",1);
        bird2.fly();
        bird2.flap();
        Animal animal3=new Carnivore("사자",77);
        animal3.eat(new Herbivore("얼룩말",77));
    }
}
