package com.kavinmaha.datastructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Character> characterSet = new HashSet<>();
        //Set<Character> characterSet = new LinkedHashSet<>(); // Ordering can be done using LinkedHastSet ?
        characterSet.add('A');
        characterSet.add('A'); // Duplicate not worked
        characterSet.add('B');
        characterSet.add('E');
        characterSet.add('D');
        characterSet.add('C');
        System.out.println(characterSet);

        // looping through Iterator
        Iterator<Character> iterator = characterSet.iterator();

        while (iterator.hasNext()){
            Character character = iterator.next();
            System.out.println(character);
        }

        // normal looping example

        for (Character character : characterSet){
            System.out.println(character);
        }
    }
}
