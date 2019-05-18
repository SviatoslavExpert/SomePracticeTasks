package com.granovskiy;

public class Cat {
    //  fields
    private String name;
    private String masterName;
    private int age;
    //  constructors
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, String masterName, int age) {
        this.name = name;
        this.masterName = masterName;
        this.age = age;
    }

    //  getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //  methods for creating objects
    public static Cat of(String name, int age) {
        return new Cat(name, age);
    }

    public static Cat of(String name, String masterName, int age) {
        return new Cat(name, masterName, age);
    }

    public static void meow(int x){
        for(int i = 0; i < x; i++) {
            System.out.println("meow");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", masterName='" + masterName + '\'' +
                ", age=" + age +
                '}';
    }
}
