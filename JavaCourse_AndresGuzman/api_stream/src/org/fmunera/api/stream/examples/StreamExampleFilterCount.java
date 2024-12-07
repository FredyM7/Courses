package org.fmunera.api.stream.examples;


import org.fmunera.api.stream.examples.models.User;

import java.util.stream.Stream;

public class StreamExampleFilterCount {
    public static void main(String[] args) {

        long count = Stream.of("fredy Munera","pato Gomez","pepa Medina","pepe Noguera", "pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(count);

    }
}
