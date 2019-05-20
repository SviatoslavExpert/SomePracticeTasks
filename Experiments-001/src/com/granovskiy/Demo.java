package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b++;
        System.out.println(a);   //  10
        System.out.println(b);   //  11
        Cat cat = new Cat("Vaska", 3);
        Cat cat2 = cat;
        cat2.age = 5;
        System.out.println("This is cat's age: " + cat.age);  //  5
    }

    static class Cat {
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
