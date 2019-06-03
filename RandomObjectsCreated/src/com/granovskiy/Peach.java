package com.granovskiy;

public class Peach extends Fruit{
    private String name;

    public Peach(int age, int taste, String name) {
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
        return "Peach{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", taste=" + taste +
                '}';
    }
}
