package com.kavinmaha.gettingStarted;

import java.util.ArrayList;
import java.util.List;

public class Statics {

    // 02.06.2021 Statics

    public static String BRAND;
    static List list;

    static {
        BRAND = "KavinMaha";
        list = new ArrayList();
        list.add("");
    }

    public static void main(String[] args) {
        Person alex = new Person("Alex");
        Person bob = new Person("Bob");
        System.out.println(alex.name);
        System.out.println(bob.name);
        System.out.println(Person.totalNumberOfPerson);
    }

    static class Person{
        static int totalNumberOfPerson = 0;
        String name;
        Person(String name){
            this.name = name;
            totalNumberOfPerson++;
        }
    }
}
