package com.granovskiy;

public class Apartment {
    private int number;

    public Apartment(int number) {
        this.number = number;
    }

    public void addOwner(Owner owner) {
        //  TODO implement me
    }

    @Override
    public String toString() {
        return "Apartment number " + number;
    }
}
