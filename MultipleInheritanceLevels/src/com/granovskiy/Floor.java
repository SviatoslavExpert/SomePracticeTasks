package com.granovskiy;

import java.util.Arrays;

public class Floor {
    private int number;
    private Apartment[] apartments;

    public Floor(int number, int apartmentsCount, NumberGenerator numbers) {
        this.number = number;
        this.apartments = new Apartment[apartmentsCount];
        for (int index = 0; index < apartmentsCount; index++) {
            apartments[index] = new Apartment(numbers.getNext());
        }
    }


    public Apartment getFreeApartment() {
        return null; //  TODO implement me
    }

    @Override
    public String toString() {
        String result = "====================\n";
        result += "Floor number " + number + "\n";
        result += "--------------------\n";
        for (Apartment apartment : apartments) {
            result += apartment.toString() + "\n";
        }
        result += "====================\n";
        return result;
    }

}