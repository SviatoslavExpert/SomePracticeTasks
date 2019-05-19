package com.granovskiy;

public class Cat extends Animal {
    //  fields
    private String type;
    private String color;
    //  constructor
    public Cat(String name, String ration, int age, double weight, boolean isSex, String type, String color) {
        super(name, ration, age, weight, isSex);
        this.type = type;
        this.color = color;
    }

    @Override
    public void getVoice() {
        System.out.println("Meow-meow!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                super.toString() +
                '}';
    }
}
