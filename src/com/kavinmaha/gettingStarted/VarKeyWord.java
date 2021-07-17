package com.kavinmaha.gettingStarted;

import java.awt.*;
import java.time.LocalDate;

public class VarKeyWord {
    public static void main(String[] args) {
        // 27.05.2021 Var keyword - supports from Java 11
//        String name = "Mani";
//        Point point = new Point(10,50);
//        double pi = 3.14d;
//        LocalDate now = LocalDate.now();
//        int value = 20;

        var name = "Mani";
        var point = new Point(10, 50);
        var pi = Math.PI;
        var now = LocalDate.now();
        var value = 20;


    }
}
