package com.granovskiy;

public class Fruit {
    int age;
    int taste;

    public Fruit(int age, int taste) {
        this.age = age;
        this.taste = taste;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTaste() {
        return taste;
    }

    public void setTaste(int taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "age=" + age +
                ", taste=" + taste +
                '}';
    }
}
