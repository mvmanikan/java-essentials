package com.kavinmaha.oops.interfaces;

public class Cat implements AnimalInterfaces {
    // 05.06.2021 Interface implementation
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void getSound() {
        System.out.println("meow meow");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
