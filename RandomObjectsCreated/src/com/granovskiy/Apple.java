package com.granovskiy;

public class Apple extends Fruit {
    String name;

    public Apple(int age, int taste, String name) {
        super(age, taste);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", taste=" + taste +
                '}';
    }
}
