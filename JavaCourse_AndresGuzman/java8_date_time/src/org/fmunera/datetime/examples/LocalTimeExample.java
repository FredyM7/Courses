package org.fmunera.datetime.examples;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class LocalTimeExample {
    public static void main(String[] args) {


        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

        LocalTime sixThirty = LocalTime.of(6, 30, 59);
        System.out.println("sixThirty (.of) = " + sixThirty);

        sixThirty = LocalTime.parse("06:30");
        System.out.println("sixThirty with parse = " + sixThirty);

        LocalTime sevenThirty = LocalTime.of(6, 30).plusHours(1);
        System.out.println("sevenThirty = " + sevenThirty);

        boolean isBefore = LocalTime.of(6, 30).isBefore(LocalTime.parse("07:30"));
        System.out.println("isBefore = " + isBefore);

        boolean isAfter = LocalTime.of(6, 30).isBefore(LocalTime.parse("07:30"));
        System.out.println("isAfter = " + isAfter);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String nowFormatted = now.format(df);
        System.out.println(nowFormatted);

        nowFormatted = df.format(now);
        System.out.println(nowFormatted);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;

        System.out.println(max);
        System.out.println(min);


    }
}
