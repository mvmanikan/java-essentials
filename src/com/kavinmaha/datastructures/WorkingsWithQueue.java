package com.kavinmaha.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingsWithQueue {
    public static void main(String[] args) {
        // 10.06.2021 - FIFO
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Mani"));
        queue.add(new Person("Sheeba"));
        queue.add(new Person("Kavin"));
        queue.add(new Person("Maha"));
        // boolean maha = queue.offer(new Person("Maha"));// returns Boolean
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll(); // Nothing is present in queue, Exception
        //queue.remove(); // Nothing is present in queue, Exception
        System.out.println(queue);
        // Output is not same as shown
    }

    static class Person{
        String name;
        Person(String name){
            this.name = name;
        }
    }
}
