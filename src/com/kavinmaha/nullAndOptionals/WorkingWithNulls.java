package com.kavinmaha.nullAndOptionals;

import java.util.Locale;

public class WorkingWithNulls {
    public static void main(String[] args) {
        //15.06.2021 Working with Nulls
          // String name = "kavinmaha";
          Integer number = null;  // null should be an object but not an primitive
          String name = null;

          // 2 ways to handle null values but try and catch is expensive
        try {
            System.out.println(name.toUpperCase(Locale.ROOT));
        } catch (NullPointerException e) {
            System.out.println("Name is null");
        }

        if (name != null) {
            System.out.println(name.toUpperCase(Locale.ROOT));
        } else {
            System.out.println("Name is null");
        }
    }
}
