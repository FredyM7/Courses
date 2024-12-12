package org.fmunera.datetime.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {
    public static void main(String[] args) {


        LocalDateTime localDateTime = LocalDateTime.parse("2021/09/23 12:45",
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        //ZoneId newYorkId = ZoneId.of("America/New_York");

        //ZonedDateTime zonaNewYork = ZonedDateTime.of(localDateTime, ZoneOffset.of("-04:00"));
        ZonedDateTime zonaNewYork = localDateTime.atZone(ZoneOffset.of("-04:00"));
        System.out.println("Hora de partida en New York = " + zonaNewYork);

        //ZoneId madridId = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNewYork.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(7);
        System.out.println("Hora de llegada en Madrid = "+ zonaMadrid);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm a, dd MMM yyyy");
        System.out.println("Detalles del viaje: ");
        System.out.println("Partida de New York: "+ df.format(zonaNewYork));
        System.out.println("Llegada a Madrid: "+df.format(zonaMadrid));

        ZoneId.getAvailableZoneIds().forEach(System.out::println);

    }
}
