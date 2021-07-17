package com.kavinmaha.oops.interfaces;

public class Main {
    public static void main(String[] args) {
        // 05.06.2021 Interface Example
        AnimalInterfaces dog = new Dog("Flex","Bulldog");
        AnimalInterfaces cat = new Cat("Rosie");
        dog.getSound();
        cat.getSound();

        //Polymorphism
        System.out.println("A" + "B");
        System.out.println(1 + 2);
    }
}
