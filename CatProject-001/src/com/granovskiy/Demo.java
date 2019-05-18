package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        //  creating cats
        Cat cat1 = Cat.of("Vaska", 2);
        Cat cat2 = Cat.of("Tom", 1);
        Cat cat3 = Cat.of("Mike", "Pavel", 2);
        Cat cat4 = cat2;
        Cat cat5 = cat3;
        //  printing to console
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat5);
        //  making cat5 meow
        cat5.meow(3);

    }
}
