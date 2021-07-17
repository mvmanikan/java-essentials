package com.kavinmaha.dateAndTime;

import java.time.*;

public class AvailableDateClasses {
    public static void main(String[] args) {
        // 11.06.2021 Local Data and Time Examples
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        LocalDateTime timeStamp = LocalDateTime.now();
        LocalDate date = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();
        System.out.println(zonedDateTime);
        System.out.println(timeStamp);
        System.out.println(date);
        System.out.println(localTime);
        System.out.println(instant);
    }
}
