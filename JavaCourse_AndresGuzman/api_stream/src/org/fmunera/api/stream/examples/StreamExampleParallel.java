package org.fmunera.api.stream.examples;

import org.fmunera.api.stream.examples.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class StreamExampleParallel {
    public static void main(String[] args) {


        List<User> list = new ArrayList<>();
        list.add(new User("Luis","Herrera"));
        list.add(new User("Alberto", "Gomez"));
        list.add(new User("Felipe", "Hernandez"));
        list.add(new User("Pablo", "Morales"));
        list.add(new User("Andres", "Rodriguez"));
        list.add(new User("Daniel", "Mendez"));
        list.add(new User("Daniel", "Restrepo"));

        long start = System.currentTimeMillis();

        String result = list.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(n -> System.out.println("Nombre thread: "+Thread.currentThread().getName()+" - "+ n))
                .flatMap(name -> {

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if(name.contains("daniel".toUpperCase())) return Stream.of(name);
                    return Stream.empty();
                })
                .findAny().orElse("");

        long end = System.currentTimeMillis();

        System.out.println("total time: "+(end-start));

        System.out.println(result);

    }
}
