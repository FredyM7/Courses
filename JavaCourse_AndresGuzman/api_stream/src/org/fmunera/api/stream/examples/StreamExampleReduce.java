package org.fmunera.api.stream.examples;


import java.util.stream.Stream;

public class StreamExampleReduce {
    public static void main(String[] args) {

        Stream<String> names = Stream.of("fredy Munera","pato Gomez","pepa Medina","pepe Noguera", "pepe García",
                        "pato Gomez", "pato Gomez", "pato Gomez")
                .distinct();

        String result = names.reduce("[Reduce result]", (a,b) -> a+", "+b);
        System.out.println(result);


    }
}
