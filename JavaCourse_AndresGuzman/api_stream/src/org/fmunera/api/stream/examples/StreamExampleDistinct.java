package org.fmunera.api.stream.examples;


import java.util.stream.Stream;

public class StreamExampleDistinct {
    public static void main(String[] args) {

        Stream<String> names = Stream.of("fredy Munera","pato Gomez","pepa Medina","pepe Noguera", "pepe García",
                        "pato Gomez", "pato Gomez", "pato Gomez")
                .distinct();

        names.forEach(System.out::println);


    }
}
