package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        Cat cat1 = Cat.of("Tom", "fish", 3, 3.5, true, "Scottish", "grey");
        System.out.println(cat1);
        System.out.println();
        makeVoice(cat1);
    }

    public static void makeVoice(Animal a) {
        a.getVoice();
    }
}
