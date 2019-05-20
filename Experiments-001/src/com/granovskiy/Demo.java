package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        //  operations with numbers
        int a = 10;
        int b = a;
        b++;
        System.out.println(a);   //  10
        System.out.println(b);   //  11
        System.out.println();

        //  operations with cats
        //  original
        Cat cat = new Cat("Vaska", 3);
        System.out.println("This is original cat's age: " + cat.age);  //  3
        //  the second
        Cat cat2 = cat;
        cat2.age = 5;
        System.out.println("This is changed cat's age: " + cat.age);  //  5
        //  the third
        cat2 = doSmth(cat);
        System.out.println("This is another changed cat's age: " + cat.age);  //  7
        System.out.println();
    }

    private static Cat doSmth(Cat cat) {
        cat.age = 7;
        return cat;
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
