package org.fmunera.api.stream.examples;


import java.util.stream.Stream;

public class StreamExampleReduceInt {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(5,10,15,20);

        int result = numbers.reduce(0, Integer::sum);
        System.out.println(result);


    }
}
