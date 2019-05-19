package com.granovskiy;

public class Dog extends Animal {
    //  fields
    private String masterName;
    private int education;

    // constructor


    public Dog(String name, String ration, int age, double weight, boolean isSex, String masterName, int education) {
        super(name, ration, age, weight, isSex);
        this.masterName = masterName;
        this.education = education;
    }

    //  getters & setters
    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    //  methods
    public static Dog of(String name, String ration, int age, double weight, boolean isSex, String masterName, int education) {
        return new Dog(name, ration, age, weight, isSex, masterName, education);
    }

    @Override
    public void getVoice() {
        System.out.println("Bark-bark-bark!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "masterName='" + masterName + '\'' +
                ", education=" + education +
                ", " + super.toString() +
                '}';
    }
}
