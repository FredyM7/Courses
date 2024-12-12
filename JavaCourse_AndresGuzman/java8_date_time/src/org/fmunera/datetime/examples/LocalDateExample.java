package org.fmunera.datetime.examples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Fecha actual: "+date);
        System.out.println("Día de la semana: "+date.getDayOfWeek());
        System.out.println("Día de la semana en español: "+date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.of("es","ES")));
        System.out.println("Número del día de la semana: "+date.getDayOfWeek().getValue());
        System.out.println("Día del mes: "+date.getDayOfMonth());
        System.out.println("Día del año: "+date.getDayOfYear());
        Month month = date.getMonth();
        System.out.println("Mes: "+month);
        System.out.println("Mes en español: "+month.getDisplayName(TextStyle.FULL, Locale.of("es","ES")));
        System.out.println("Mes valor: "+date.getMonthValue());
        System.out.println("Año: "+date.getYear());
        System.out.println("Era: "+date.getEra());

        date = LocalDate.of(2025, 12, 1);
        System.out.println(date);

        date = LocalDate.of(2025, Month.JULY, 7);
        System.out.println(date);

        date = LocalDate.parse("2025-12-29");
        System.out.println(date);

        LocalDate nextDay = LocalDate.now().plusDays(1);
        System.out.println(nextDay);

        LocalDate prevMonthSameDay = LocalDate.now().minusMonths(1);
        System.out.println(prevMonthSameDay);

        DayOfWeek dayWeek = LocalDate.parse("2024-12-08").getDayOfWeek();
        System.out.println(dayWeek);

        int dayMonth = LocalDate.of(2024, 12, 8).getDayOfMonth();
        System.out.println(dayMonth);

        boolean isLeap = LocalDate.now().isLeapYear();
        System.out.println(isLeap);

        boolean isAfter = LocalDate.of(2024, 12, 8).isAfter(LocalDate.of(2024, 12, 9));
        System.out.println(isAfter);

        boolean isBefore = LocalDate.of(2024, 12, 8).isBefore(LocalDate.of(2024, 12, 9));
        System.out.println(isBefore);

        isBefore = LocalDate.now().isBefore(LocalDate.now().plusDays(1));
        System.out.println(isBefore);

    }
}
