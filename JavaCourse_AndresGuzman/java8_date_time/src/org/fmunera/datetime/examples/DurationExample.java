package org.fmunera.datetime.examples;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {
    public static void main(String[] args) {

        LocalDateTime dateTime1 = LocalDateTime.now();
        //dateTime1 = dateTime1.withMonth(10); //Se debe asignar nuevamente a la variable ya que LocalDateTime es **inmutable**.
        LocalDateTime dateTime2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);

        Duration lapse = Duration.between(dateTime1, dateTime2);
        System.out.println("lapse = " + lapse);
        System.out.println(lapse.getSeconds());
        System.out.println(lapse.getNano());
        System.out.println(lapse.toDays());
        System.out.println(lapse.toHours());

        System.out.println("Sumamos 5 horas: "+ lapse.plusHours(5));
    }
}
