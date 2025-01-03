package org.fmunera.api.stream.examples;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamExampleInfinityGenerate {
    public static void main(String[] args) {

        AtomicInteger counter = new AtomicInteger();

        Stream.generate(() -> {

                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return counter.incrementAndGet();
                })
                .limit(5)
                .forEach(System.out::println);

    }
}
