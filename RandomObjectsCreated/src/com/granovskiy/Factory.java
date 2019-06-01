package com.granovskiy;

public class Factory {

    public static Apple getApple(int age, int taste, String name) {
        return new Apple(age, taste, name);
    }

    public static Lemon getLemon(int age, int taste, String name) {
        return new Lemon(age, taste, name);
    }

    public static Peach getPeach(int age, int taste, String name) {
        return new Peach(age, taste, name);
    }

}
