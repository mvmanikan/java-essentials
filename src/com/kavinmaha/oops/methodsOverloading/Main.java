package com.kavinmaha.oops.methodsOverloading;

public class Main {
    public static void main(String[] args) {
        // 05.06.2021 Method Overloading
        Addition addition = new Addition();
        System.out.println(addition.add(5, 10));
        System.out.println(addition.add(5, 10, 15));
    }
}
