package com.kavinmaha.nullAndOptionals;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        // 16.06.2021 Optional Object for null
        String name = "Maha";
        //String name = null;
//        Optional.of(name); // Value cannot be null
//        Optional.ofNullable(name); // Can be null or not null
        // Functional Programming
//        String theName = Optional.ofNullable(name).orElse("Name is Null. Please check it!");
        String theName = Optional.ofNullable(name).map(String::toUpperCase).orElseGet(() ->{
            // logic
            return "Name is Null. Please check it!";
        });
        System.out.println(theName);
    }
}
