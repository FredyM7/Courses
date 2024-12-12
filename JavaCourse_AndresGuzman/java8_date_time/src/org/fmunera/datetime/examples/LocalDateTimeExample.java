package org.fmunera.datetime.examples;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime dateTime = LocalDateTime.of(2024, Month.DECEMBER, 9, 21, 15, 59);
        System.out.println("dateTime .of = " + dateTime);

        dateTime = LocalDateTime.parse("2024-12-10T21:17:59.127014");
        System.out.println("dateTime .parse = " + dateTime);

        LocalDateTime dateTime2 = dateTime.plusDays(1).plusHours(1);
        System.out.println("dateTime2 = " + dateTime2);
        //INMUTABILIDAD, dateTime no es modificado ya que la clase LocalDateTime (y la mayoría de java.time) es inmutable.
        System.out.println("Inmutable dateTime = " + dateTime);

        Month month = dateTime.getMonth();
        System.out.println("month = " + month);

        int day = dateTime.getDayOfMonth();
        System.out.println("day = " + day);

        int year = dateTime.getYear();
        System.out.println("year = " + year);
        
        String dateTimeFormatted1 = dateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println("dateTimeFormatted = " + dateTimeFormatted1);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        String dateTimeFormatted2 = dateTime.format(df);
        System.out.println("dateTimeFormatted2 = " + dateTimeFormatted2);
        
        String dateTimeFormatted3 = df.format(dateTime);
        System.out.println("dateTimeFormatted3 = " + dateTimeFormatted3);




    }
}
