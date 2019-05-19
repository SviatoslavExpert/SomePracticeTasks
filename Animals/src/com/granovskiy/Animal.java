package com.granovskiy;

public class Animal {
    //  fields
    private String name;
    private String ration;
    private int age;
    private double weight;
    private boolean isSex;

    //  constructor
    public Animal(String name, String ration, int age, double weight, boolean isSex) {
        this.name = name;
        this.ration = ration;
        this.age = age;
        this.weight = weight;
        this.isSex = isSex;
    }

    //  method
    public void getVoice() {
        System.out.println("Here is my Animal voice!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", ration='" + ration + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isSex=" + isSex +
                '}';
    }
}
