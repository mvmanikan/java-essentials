package com.kavinmaha.datastructures;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        // 06.06.2021 - List APIs
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.remove(1);
        numbers.add(0,-1);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.contains(5));
        System.out.println(numbers.contains(10));
        numbers.clear();
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
        //Loop
        for (Object number:numbers){
            System.out.println(number);
        }
        System.out.println();
        //Streams - Functional Programming
        numbers.forEach(System.out::println);
    }
}
