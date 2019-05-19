package com.granovskiy;

public class Chicken extends Animal {
    //fields
    private String size;
    private String type;

    //  constructor
    public Chicken(String name, String ration, int age, double weight, boolean isSex, String size, String type) {
        super(name, ration, age, weight, isSex);
        this.size = size;
        this.type = type;
    }

    @Override
    public void getVoice() {
        System.out.println("Kud-ku-da");
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                super.toString() +
                '}';
    }
}
