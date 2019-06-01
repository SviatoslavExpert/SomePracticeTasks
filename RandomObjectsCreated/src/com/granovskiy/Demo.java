package com.granovskiy;

import java.util.Random;

import static com.granovskiy.Factory.*; //  important import :)))

public class Demo {

    public static void main(String[] args) {
        int x;
        Random r = new Random();
        x = r.nextInt(3); //  casting!!!
        System.out.println(x);
        if (x == 0) {
            System.out.println(getApple(2, 5, "Tasty"));
        } else if (x == 1) {
            System.out.println(getLemon(3, 7, "BigOne"));
        } else {
            System.out.println(getPeach(1, 9, "Peachy"));
        }

    }

}