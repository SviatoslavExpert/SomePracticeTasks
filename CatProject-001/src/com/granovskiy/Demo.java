package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        //  creating cats
        Cat cat1 = Cat.of("Vaska", 2);
        Cat cat2 = Cat.of("Tom", 1);
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
