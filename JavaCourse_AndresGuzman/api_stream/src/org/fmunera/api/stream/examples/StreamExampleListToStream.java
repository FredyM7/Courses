package org.fmunera.api.stream.examples;

import org.fmunera.api.stream.examples.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExampleListToStream {
    public static void main(String[] args) {


        List<User> list = new ArrayList<>();
        list.add(new User("Luis","Herrera"));
        list.add(new User("Alberto", "Gomez"));
        list.add(new User("Felipe", "Hernandez"));
        list.add(new User("Pablo", "Morales"));
        list.add(new User("Andres", "Rodriguez"));
        list.add(new User("Daniel", "Mendez"));
        list.add(new User("Daniel", "Restrepo"));

        Stream<String> names = list.stream()
                .map(u -> u.getName().toUpperCase().
                        concat(" ").
                        concat(u.getLastName().toUpperCase()))
                .flatMap(u -> {
                    if(u.contains("daniel".toUpperCase())) return Stream.of(u);
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(names.count());

    }
}
