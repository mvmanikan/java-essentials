package com.kavinmaha.datastructures;

import java.awt.*;
import java.util.ArrayList;

import java.util.List;

public class Generics {
    public static void main(String[] args) {
        // 07.06.2021 - Generics
        List<Integer> numbers = new ArrayList<>(); //Generics
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        //numbers.add("Hello"); // All can be added in a List 'Character','String' etc
        //numbers.add('A');
        //numbers.add(new Point(1,2));
        numbers.remove(1);
        numbers.add(0, -1);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.contains(5));
        System.out.println(numbers.contains(10));
        //numbers.clear();
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
        //Loop
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();
        //Streams - Functional Programming
        numbers.forEach(System.out::println);
    }
}

