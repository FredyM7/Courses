package org.fmunera.api.stream.examples;


import org.fmunera.api.stream.examples.models.User;

import java.util.List;
import java.util.stream.Stream;

public class StreamExampleFilter {
    public static void main(String[] args) {

        Stream<User> names = Stream.of("fredy Munera","pato Gomez","pepa Medina","pepe Noguera", "pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .filter(u -> u.getName().equals("pepe"))
                .peek(System.out::println);

       List<User> list = names.toList();// ó // names.collect(Collectors.toList())
       list.forEach(System.out::println);
       //names.forEach(System.out::println);

    }
}
