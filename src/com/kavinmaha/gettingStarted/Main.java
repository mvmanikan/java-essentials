package com.kavinmaha.gettingStarted;

public class Main {

    public static void main(String[] args) {
        // 14.05.2021 Non-primitive types
        Person alex = new Person("Alex");
        Person mariam = alex;

        alex.name = "Alexander";
        //mariam.name = "Alexa";

        System.out.println(alex.name + mariam.name);

    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}

