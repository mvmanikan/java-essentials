package com.kavinmaha.oops.interfaces;

public class Dog implements AnimalInterfaces {
    // 05.06.2021 Interface implementation
    private String breed;
    private String name;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void getSound() {
        System.out.println("woof woof");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
