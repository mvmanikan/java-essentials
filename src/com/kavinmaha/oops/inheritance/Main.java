package com.kavinmaha.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        // 05.06.2021 - Inheritance Example
        Animal animal = new Animal("Bobby");
        Animal dog = new Dog("Flex","Bulldog");
        System.out.println(animal.getName());
        System.out.println(dog.getName());
        //System.out.println(dog.getName() + " is a " + dog.getBreed());
    }
}
