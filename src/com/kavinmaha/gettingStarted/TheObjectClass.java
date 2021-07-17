package com.kavinmaha.gettingStarted;

import java.awt.*;
import java.util.Arrays;

public class TheObjectClass {
    public static void main(String[] args) {
        // 02.06.2021
        Object name = "Mani";
        System.out.println(name);
        String namen = "Mani";
        System.out.println(namen);
        Object[] list = {"Mani", "Maha", "Keerthi", "Kavin", "Achu", "Vishnu"};
        System.out.println(Arrays.stream(list).count());
        Object p = new Object(); // It works as well instead of
        Point point = new Point(); // point. -- gives lot of options when compared to Object p
    }
}
