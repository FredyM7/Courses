package org.fmunera.api.stream.examples;


import org.fmunera.api.stream.examples.models.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExampleFilterAnyMatch {
    public static void main(String[] args) {

        //FORMA DECLARATIVA //DECLARATIVE FORM
        boolean exists = Stream.of("fredy Munera","pato Gomez","pepa Medina","pepe Noguera", "pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(5));

        System.out.println(exists);


        //FORMA IMPERATIVA //IMPERATIVE FORM
        /*List<User> userList = Arrays.asList(new User("Alberto","Herrera"),
                new User("Daniel","Muñoz"),
                new User("Maria","Rodriguez"),
                new User("Carlos", "Mendez"),
                new User("Fernando","Agudelo"));

        boolean result = false;
        for(User user: userList){
            if(user.getId().equals(9)){
                result = true;
                break;
            }
        }

        System.out.println(result);*/

    }
}
