package org.fmunera.datetime.examples;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class DurationExample2 {
    public static void main(String[] args) {


        Instant instant1 = Instant.now();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        Instant instant2 = Instant.now();

        Duration time = Duration.between(instant1, instant2);
        System.out.println("time = " + time);
    }
}
