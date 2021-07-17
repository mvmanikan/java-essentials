package com.kavinmaha.oops.abstraction;

public class Main {
    public static void main(String[] args) {
        // 05.06.2021 Abstraction Example
        Animal dog = new Dog("Flex","Bulldog");
        Animal cat = new Cat("Rosie");
        dog.getSound();
        cat.getSound();

        //Polymorphism
        System.out.println("A" + "B");
        System.out.println(1 + 2);
    }
}
