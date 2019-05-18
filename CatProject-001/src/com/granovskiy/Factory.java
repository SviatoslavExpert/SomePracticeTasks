package com.granovskiy;

public class Factory {
    //  Factory methods for creating objects
    public static Cat create(String name, int age) {
        return new Cat(name, age);
    }
    public static Dog create(String dogName, String color, String size, int dogAge, Boolean isSex){
        return new Dog(dogName, color, size, dogAge, isSex);
    }
}