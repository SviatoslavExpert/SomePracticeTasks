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

    //  getters & setters
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //  methods
    public static Chicken of(String name, String ration, int age, double weight, boolean isSex, String size, String type) {
        return new Chicken(name, ration, age, weight, isSex, size, type);
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
                ", " + super.toString() +
                '}';
    }
}
