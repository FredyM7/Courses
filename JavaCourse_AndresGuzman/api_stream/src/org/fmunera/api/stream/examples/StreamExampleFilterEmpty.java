package org.fmunera.api.stream.examples;


import org.fmunera.api.stream.examples.models.User;

import java.util.stream.Stream;

public class StreamExampleFilterEmpty {
    public static void main(String[] args) {

        long count = Stream.of("fredy Munera","","pepa Medina","pepe Noguera", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println(count);


    }
}
