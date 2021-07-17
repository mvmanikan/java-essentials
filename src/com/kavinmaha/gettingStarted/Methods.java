package com.kavinmaha.gettingStarted;

import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
        // 02.06.2021
        int x = incrementNumber(10);
        print(x);
        LocalDate currentDate = getCurrentDate();
        print(currentDate);
        LocalDate minusDays = getMinusDays(10);
        System.out.println(minusDays);
    }

    private static int incrementNumber(int value){
        return value + 1;
    }

    private static void print(int value){
        System.out.println("value : " + value);
    }

    private static void print(LocalDate value){
        System.out.println("value : " + value);
    }

    private static LocalDate getCurrentDate(){
        return LocalDate.now();
    }

    private static LocalDate getMinusDays(int value){
        return LocalDate.now().minusDays(value);
    }
}
