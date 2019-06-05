package com.granovskiy;

public class Owner {

    private final String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner: " + name;
    }
}
