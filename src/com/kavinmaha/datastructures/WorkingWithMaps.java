package com.kavinmaha.datastructures;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        // 10.06.2021
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Mani");
        map.put(2,"Sheeba");
        map.put(3,"Kavin"); // will be overwritten, last only will be taken
        map.put(3,"Ammu");
        map.put(4, "Maha");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.keySet());

        for (int key : map.keySet()){
            System.out.println(map.get(key));
        }

        // Optional for learning
        map.forEach((Integer, String) -> {
            System.out.println(Integer + String);
        });

        map.forEach((K, V) -> {
            System.out.println(K + " - " + V);
        });

        String DefaultV = map.getOrDefault(5, "Oops - The value for this key is not present");
        System.out.println(DefaultV);

    }
}
