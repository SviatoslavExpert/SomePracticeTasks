package com.granovskiy;


public class Main {
    public static void main(String[] args) {
        House house = new House(16, 4);

        Owner owner1 = new Owner("Stiven.Pupkin");
        Owner owner2 = new Owner("Selena.Pupkina"); //  the style: from sky to inside

        house.settle(owner1);
        house.settle(owner2);

        System.out.println(house.toString());

    }
}
