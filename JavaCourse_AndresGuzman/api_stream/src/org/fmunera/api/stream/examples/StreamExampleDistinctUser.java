package org.fmunera.api.stream.examples;


import org.fmunera.api.stream.examples.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamExampleDistinctUser {
    public static void main(String[] args) {

        Stream<User> names = Stream.of("fredy Munera","pato Gomez", "pato Gomez", "pato Gomez", "pepa Medina","pepe Noguera", "pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .distinct();
        
        names.forEach(System.out::println);


    }
}
