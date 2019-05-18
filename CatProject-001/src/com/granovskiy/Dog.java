package com.granovskiy;

public class Dog {
    //  fields
    private String dogName;
    private String color;
    private String size;
        private int dogAge;
    private Boolean isSex;
    //  constructor
    public Dog(String dogName, String color, String size, int dogAge, Boolean isSex) {
        this.dogName = dogName;
        this.color = color;
        this.size = size;
        this.dogAge = dogAge;
        this.isSex = isSex;
    }
    //  getters and setters
    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public Boolean getSex() {
        return isSex;
    }

    public void setSex(Boolean sex) {
        isSex = sex;
    }
    //  methods
    public static void bark() {
        System.out.println("Bark");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", dogAge=" + dogAge +
                ", isSex=" + isSex +
                '}';
    }
}
