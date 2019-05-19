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

    //  getters & setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //  methods
    public static Cat of(String name, String ration, int age, double weight, boolean isSex, String type, String color) {
        return new Cat(name, ration, age, weight, isSex, type, color);
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
                ", " + super.toString() +
                '}';
    }
}
