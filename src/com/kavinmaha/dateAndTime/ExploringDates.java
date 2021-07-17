package com.kavinmaha.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ExploringDates {
    public static void main(String[] args) {
        // 11.06.2021 Exploring Dates
        LocalDate localDate = LocalDate.of(2021, Month.JUNE, 11);
        System.out.println(localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());
        System.out.println(localDate.minus(2, ChronoUnit.DAYS));
        System.out.println(localDate.minus(2, ChronoUnit.DECADES));
        System.out.println(localDate.minus(2, ChronoUnit.YEARS));
        System.out.println(localDate.isBefore(LocalDate.now()));
    }
}
