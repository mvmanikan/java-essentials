package com.kavinmaha.gettingStarted;

import java.awt.*;

public class PassByValVsRef {
    public static void main(String[] args) {
        // 27.05.2021 Pass by value vs Reference
        // Pass by value
        int x = 0;
        int y = incrementCounter(x);
        System.out.println("x : " + x);
        System.out.println("y : " + y);

        // Pass by reference
        Point point = new Point(10,50);
        passByRef(point);
        System.out.println(point.x);
        System.out.println(point.y);
    }
    static int incrementCounter(int value){
        return value + 1;
    }

    static void passByRef(Point point){
        point.x = 0;
        point.y = 0;
    }
}
