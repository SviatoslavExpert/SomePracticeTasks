package com.granovskiy;

public class Lemon extends Fruit{
    private String name;

    public Lemon(int age, int taste, String name) {
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
        return "Lemon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", taste=" + taste +
                '}';
    }
}
