package com.kavinmaha.gettingStarted;

import java.awt.*;

public class FinalKeyword {
    public static void main(String[] args) {
        // 27.05.2021 Final Keyword
        final String name = "Mani";
        final double value = Math.PI;
        // name = "Maha"; not possible when it is final
        // name = "Kavin";
        final Point point = new Point(10,50);
        //point = new Point(25,30);  not possible to reassign when it is final
        point.x=20;
        point.y=25;
    }
}
