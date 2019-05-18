package com.granovskiy;

public class Factory {
    //  Factory method for creating objects
    public static Cat create(String name, int age) {
        return new Cat(name, age);
    }
}