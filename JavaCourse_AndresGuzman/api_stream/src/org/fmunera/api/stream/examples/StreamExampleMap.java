package org.fmunera.api.stream.examples;


import org.fmunera.api.stream.examples.models.User;

import java.util.List;
import java.util.stream.Stream;

public class StreamExampleMap {
    public static void main(String[] args) {

        /*Stream<User> names = Stream.of("fredy Munera","pato Gomez","pepa Medina","pepe Noguera")
                        .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                        .peek(System.out::println)
                        .map(user -> {
                            String name = user.getName().toUpperCase();
                            user.setName(name);
                            return user;
                        });

        List<User> list = names.toList();// ó // names.collect(Collectors.toList())
        list.forEach(System.out::println);
*/

        Stream<String> names = Stream.of("nombre1","nombre2","nombre3","nombre4")
                .peek(System.out::println)
                .map(String::toUpperCase);

        names.forEach(System.out::println);


    }
}
