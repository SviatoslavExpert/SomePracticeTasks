package com.granovskiy;

public class Dog extends Animal {
    //  fields
    private String masterName;
    private int education;

    // constructor
    public Dog(String name, String ration, int age, double weight, boolean isSex, int education) {
        super(name, ration, age, weight, isSex);
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
    @Override
    public void getVoice() {
        System.out.println("Bark-bark-bark!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "masterName='" + masterName + '\'' +
                ", education=" + education +
                super.toString() +
                '}';
    }
}
