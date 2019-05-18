package com.granovskiy;

import static com.granovskiy.Factory.*;

public class Demo {
    public static void main(String[] args) {
        //  creating cats
        Cat cat1 = Cat.of("Vaska", 2);
        Cat cat2 = Cat.of("Tom", 1);
        Cat cat3 = Cat.of("Mike", 2);
        Cat cat4 = cat2;
        Cat cat5 = cat3;
        //  printing to console
        System.out.println("This is cat1: " + cat1);
        System.out.println("This is cat2: " + cat2);
        System.out.println("This is cat3: " + cat3);
        System.out.println("This is cat4: " + cat4);
        System.out.println("This is cat5: " + cat5);
        System.out.println();
        //  making cat5 meow
        cat5.meow(3);
        System.out.println();
        //  cat6 made with Factory
        Cat cat6 = create("Bob", 5);
        System.out.println("This is cat6: " + cat6);
        System.out.println();
        //  cat5
        cat5 = Cat.of("Boy", 5);
        System.out.println("This is cat5: " + cat5);
        System.out.println("This is cat3: " + cat3);
        System.out.println();
        //  state of cat2 and cat4 changed with a setter
        cat2.setName("Mura");
        cat2.setAge(7);
        System.out.println("This is cat2: " + cat2);
        System.out.println("This is cat4: " + cat4);
        System.out.println();
        //  Printing objects field values using getters
        System.out.println("This is the name of cat5: " + cat5.getName());
        System.out.println("This is the age of cat3: " + cat3.getAge());
        System.out.println();
        //  dog is created
        Dog dog1 = create("Baikal", "red", "big", 5, true);
        System.out.println(dog1);
        dog1.bark();

    }
}
