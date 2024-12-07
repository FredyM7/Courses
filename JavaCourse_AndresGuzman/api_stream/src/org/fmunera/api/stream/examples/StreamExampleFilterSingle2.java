package org.fmunera.api.stream.examples;


import org.fmunera.api.stream.examples.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamExampleFilterSingle2 {
    public static void main(String[] args) {

        User user = Stream.of("fredy Munera","pato Gomez","pepa Medina","pepe Noguera", "pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(5))
                .findFirst().orElseGet(() -> new User("John", "Doe"));

        System.out.println(user);

    }
}
