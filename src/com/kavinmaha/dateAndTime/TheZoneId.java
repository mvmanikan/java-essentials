package com.kavinmaha.dateAndTime;

import java.time.*;

public class TheZoneId {
    public static void main(String[] args) {
        // 11.06.2021 ZonedIds
        LocalDateTime timeStamp = LocalDateTime.now(ZoneId.of("Indian/Mauritius"));
//        ZoneId.getAvailableZoneIds().forEach(System.out::println);
        System.out.println(timeStamp);
        System.out.println(LocalDateTime.now());
    }
}
