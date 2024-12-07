package org.fmunera.api.stream.examples;


import org.fmunera.api.stream.examples.models.User;

import java.util.stream.Stream;

public class StreamExampleFlatMap {
    public static void main(String[] args) {

        Stream<User> names = Stream.of("fredy Munera","pato Gomez","pepa Medina","pepe Noguera", "pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .flatMap(u -> {
                    if(u.getName().equals("pepe")) return Stream.of(u);
                    return Stream.empty();
                })
                .peek(System.out::println);

       //List<User> list = names.toList();// ó // names.collect(Collectors.toList())
       //list.forEach(System.out::println);
        System.out.println(names.count());


    }
}
