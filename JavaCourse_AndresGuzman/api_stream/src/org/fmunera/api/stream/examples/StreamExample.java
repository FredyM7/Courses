package org.fmunera.api.stream.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //FORMAS DE CREAR UN STREAM

        //Stream<String> names = Stream.of("paco","pato","pepa","pepe");
        //names.forEach(System.out::println);

        //String[] array = {"paco","pato","pepa","pepe"};
        //Stream<String> names = Arrays.stream(array);
        //names.forEach(System.out::println);

        /*Stream<String> names = Stream.<String>builder()
                .add("paco")
                .add("pato")
                .add("pepa")
                .add("pepe")
                .build();
        names.forEach(System.out::println);*/

        List<String> list = Arrays.asList("paco","pato","pepa","pepe");
        //Stream<String> names = list.stream();
        //names.forEach(System.out::println);

        list.stream().forEach(System.out::println);



    }
}
