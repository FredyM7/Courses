package org.fmunera.api.stream.examples;


import org.fmunera.api.stream.examples.models.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExampleFilterSingle {
    public static void main(String[] args) {

        Stream<User> names = Stream.of("fredy Munera","pato Gomez","pepa Medina","pepe Noguera", "pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .filter(u -> u.getName().equals("pespe"))
                .peek(System.out::println);

        Optional<User> user = names.findFirst();
        //System.out.println(user.orElse(new User("John", "Doe")));
        //System.out.println(user.orElseGet(() -> new User("hey","hey")));
        //System.out.println(user.orElseThrow());

        if(user.isPresent()){
            System.out.println(user.get().getName());
        } else {
            System.out.println("¡No se encontró el objeto!");
        }


    }
}
