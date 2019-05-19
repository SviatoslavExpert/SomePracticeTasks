package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        //  Cat object works
        Cat cat1 = Cat.of("Tom", "fish", 3, 3.5, true, "Scottish", "grey");
        System.out.println(cat1);
        makeVoice(cat1);
        System.out.println();
        //  Dog object works
        Dog dog1 = Dog.of("Bob", "meat", 5, 5.2, false, "Mike", 10);
        System.out.println(dog1);
        makeVoice(dog1);
    }

    public static void makeVoice(Animal a) {
        a.getVoice();
    }
}
