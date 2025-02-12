package com.telran.mylesson25Date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTimeExample {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();

        System.out.println(now);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);

        LocalDate localDate = now.toLocalDate();
        LocalTime localTime = now.toLocalTime();
        ZoneId zone = now.getZone();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zone);
        System.out.println(zonedDateTime);
    }
}
