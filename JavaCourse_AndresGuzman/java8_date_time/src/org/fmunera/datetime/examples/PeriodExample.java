package org.fmunera.datetime.examples;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2004, 8, 5);
        LocalDate localDate2 = LocalDate.of(2025, 12, 31 );
        LocalDate localDate3 = localDate2.withMonth(1);
        localDate3 = localDate3.withDayOfMonth(27);

        Period period = Period.between(localDate1, localDate3);

        System.out.printf("Período entre %s y %s hay %d años, %d meses y %d dias.",
                localDate1, localDate3, period.getYears(), period.getMonths(), period.getDays());

    }
}
